package ru.gb.buttonnavigation

import androidx.core.content.res.TypedArrayUtils.getText
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ButtonNavigationTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun clickButtonHome() {
        onView(withId(R.id.navigation_home)).perform(click()).check(matches(isDisplayed()))
        onView(withId(R.id.text_home)).check(matches(ViewMatchers.withText("This is home Fragment")))

    }

    @Test
    fun clickButtonDashboard() {
        onView(withId(R.id.navigation_dashboard)).perform(click()).check(matches(isDisplayed()))
        onView(withId(R.id.text_dashboard)).check(matches(ViewMatchers.withText("This is dashboard Fragment")))
    }

    @Test
    fun clickButtonNotifications() {
        onView(withId(R.id.navigation_notifications)).perform(click()).check(matches(isDisplayed()))
        onView(withId(R.id.text_notifications)).check(matches(ViewMatchers.withText("This is notifications Fragment")))
    }

}