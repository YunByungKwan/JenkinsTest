package com.kwancorp.jenkinstestapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.kwancorp.jenkinstestapp.ui.theme.JenkinsTestAppTheme
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun myTest() {
        composeTestRule.setContent {
            JenkinsTestAppTheme {
                Greeting("Android")
            }
        }
        composeTestRule.onNodeWithText("Hello Android!").assertIsDisplayed()
    }
}