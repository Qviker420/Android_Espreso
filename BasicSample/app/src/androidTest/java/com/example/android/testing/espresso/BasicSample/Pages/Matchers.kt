package com.example.android.testing.espresso.BasicSample.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object Matchers {
        val STRING_TO_BE_TYPED = "Espresso"
        val FULL_NAME = "Demetre Chaligava"
        val CANDY = "ROSHEN CHOCOLATE WITH BUBBLES IS SOFOS FAVIURITE"
        val editTextInput: Matcher<View> by lazy { withId(R.id.editTextUserInput) }
        val changeTextButton: Matcher<View> by lazy { withId(R.id.changeTextBt) }
        val openActivityAndChangeBtn:Matcher<View> by lazy { withId(R.id.activityChangeTextBtn) }
        val textToBeChanged:Matcher<View> by lazy { withId(R.id.textToBeChanged) }
}
