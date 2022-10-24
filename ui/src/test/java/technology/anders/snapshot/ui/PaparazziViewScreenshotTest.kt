package technology.anders.snapshot.ui

import android.view.View
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class PaparazziViewScreenshotTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun testPaparazziView() {
        val view = paparazzi.inflate<View>(R.layout.view_paparazzi)

        paparazzi.snapshot(view)
    }
}