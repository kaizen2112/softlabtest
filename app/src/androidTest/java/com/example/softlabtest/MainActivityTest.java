package com.example.softlabtest;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testShapeInsert(){
        Espresso.onView(ViewMatchers.withId(R.id.ShapeEditText))
                .perform(ViewActions.typeText("Sedan"));

        Espresso.onView(ViewMatchers.withId(R.id.ColorEditText))
                .perform(ViewActions.typeText("Red"));

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("4")));

        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView2))
                .check(ViewAssertions.matches(ViewMatchers.withText("100.0")));

        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView3))
                .check(ViewAssertions.matches(ViewMatchers.withText("400.0")));

        Espresso.onView(ViewMatchers.withId(R.id.ColorTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The color is Red\n")));
    }
}
