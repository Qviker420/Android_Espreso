package com.example.android.testing.espresso.BasicSample.TestClasses

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.Steps.Steps
import com.example.android.testing.espresso.BasicSample.getText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()
    val steps: Steps = Steps()
    @Test
    fun changeTextTestOne()
    {
        steps.changeText(steps.matchers.FULL_NAME)
        steps.clickChangeButton()
        steps.validateChangedText(steps.matchers.FULL_NAME)
    }
    @Test
    fun changeTextTestTwo()
    {
        steps.changeText(steps.matchers.CANDY)
        steps.openActivityAndChangeBTN()
        steps.validateChangedText(steps.matchers.CANDY)
    }
}