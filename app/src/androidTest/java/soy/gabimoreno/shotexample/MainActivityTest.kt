package soy.gabimoreno.shotexample

import androidx.test.rule.ActivityTestRule
import com.karumi.shot.ScreenshotTest
import org.junit.Rule
import org.junit.Test

class MyActivityTest : ScreenshotTest {

    @get:Rule
    val activityTestRule = ActivityTestRule(
        MainActivity::class.java,
        false,
        false
    )

    @Test
    fun mainActivityIsShownProperly() {
        val mainActivity = startMainActivity()
        compareScreenshot(mainActivity);
    }

    private fun startMainActivity(): MainActivity = activityTestRule.launchActivity(null)
}
