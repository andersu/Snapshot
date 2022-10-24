package technology.anders.snapshot.ui

import android.view.View
import app.cash.paparazzi.Paparazzi
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

@RunWith(TestParameterInjector::class)
class XmlScreenshotTests {

    object LayoutNameProvider : TestParameter.TestParameterValuesProvider {
        override fun provideValues(): List<String> {
            val prefix = BuildConfig.PAPARAZZI_PREFIX
            val layoutNames = mutableListOf<String>()
            File("src/main/res/layout").walk().forEach {
                if (it.extension == "xml" && it.nameWithoutExtension.startsWith(prefix)) {
                    layoutNames.add(it.nameWithoutExtension)
                }
            }

            return layoutNames
        }
    }

    @get:Rule
    val paparazzi = Paparazzi(
        maxPercentDifference = 0.3,
        theme = "android:Theme.MaterialComponents.Light.NoActionBar"
    )

    @Test
    fun xml_tests(
        @TestParameter(valuesProvider = LayoutNameProvider::class) layoutName: String,
        @TestParameter baseDeviceConfig: BaseDeviceConfig,
        // For now 1.5 does not work well because the filename uses a "," on the developer's machine and looks for a "." in Bitrise
        @TestParameter(value = [/*"de-rDE",*/ "en-rGB"/*, "es-rES", "nb-rNO", "nl-rNL"*/]) locale: String,
        @TestParameter(value = ["1.0", "1.5"]) fontScale: Float
    ) {
        paparazzi.unsafeUpdateConfig(
            baseDeviceConfig.deviceConfig.copy(
                softButtons = false,
                locale = locale,
                fontScale = fontScale
            )
        )
        val layoutId = ResourceUtil.getResourceByName(layoutName)
        val view = paparazzi.inflate<View>(layoutId)
        paparazzi.snapshot(view)
    }
}