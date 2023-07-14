package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Pages.Matchers
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText
import org.junit.Assert

class Steps {
    val matchers: Matchers = Matchers;
    fun changeText(text:String)
    {
        matchers.editTextInput.typeText(text);
    }
    fun clickChangeButton()
    {
        matchers.changeTextButton.tap();
    }
    fun openActivityAndChangeBTN()
    {
        matchers.openActivityAndChangeBtn.tap();
    }
    fun validateChangedText(actualString: String)
    {
        Assert.assertEquals(actualString, matchers.textToBeChanged.getText())
    }

}