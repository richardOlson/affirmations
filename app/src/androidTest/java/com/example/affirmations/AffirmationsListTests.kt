package com.example.affirmations

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test


@RunWith(AndroidJUnit4::class)
class AffirmationsListTests {

    // this rule is getting the main activity
    // so that we can use it in the instrumentation test
    @get:Rule
    val mainAct = ActivityScenarioRule(MainActivity::class.java)

    /*
    This is the method that will be call to scroll to something
    and then see if we are at the right area
     */
    @Test
    fun scroll_to_item(){
        //will get the RecyclerView to perform actions on it
        // will scroll to the view that has the 10 affirmation text
        onView(withId(R.id.recyclerView)).perform(
            RecyclerViewActions.scrollTo<RecyclerView.ViewHolder>(
                hasDescendant(withText(R.string.affirmation10))

            ))

        // now will assert that this is the same one that we are expecting
        // will get the View of the tenth affirmation and
        // will check to see that it has the text displayed
        onView(withText(R.string.affirmation10))
            .check(ViewAssertions.matches(isDisplayed()))
    }
}