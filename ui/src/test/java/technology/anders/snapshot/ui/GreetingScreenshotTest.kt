package technology.anders.snapshot.ui

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class GreetingScreenshotTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun testGreeting() {
        paparazzi.snapshot {
            Greeting("Anders")
        }
    }
}



