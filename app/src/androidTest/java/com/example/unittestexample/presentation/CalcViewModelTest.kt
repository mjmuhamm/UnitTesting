package com.example.unittestexample.presentation

import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onChild
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import com.example.unittestexample.data.CalcRepositoryImpl
import com.example.unittestexample.domain.AddUseCase
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CalcViewModelTest {

    @get:Rule
    val composeRule = createComposeRule()
    val calcViewModel = CalcViewModel(AddUseCase(CalcRepositoryImpl()))

    @Before
    fun setUp() {
        composeRule.setContent {
            CalcScreen(calcViewModel)

        }
        composeRule.onNodeWithTag("FIELD_A").performTextClearance()
        composeRule.onNodeWithTag("FIELD_B").performTextClearance()
    }

    @Test
    fun add_the_fields_button_is_visible() {
        composeRule.onNodeWithTag("add_Btn").isDisplayed()
    }

    @Test
    fun correct_result_is_shown() {
        composeRule.onNodeWithTag("FIELD_A").performTextClearance()
        composeRule.onNodeWithTag("FIELD_A").performTextInput("5")
        composeRule.onNodeWithTag("FIELD_B").performTextClearance()
        composeRule.onNodeWithTag("FIELD_B").performTextInput("6")
        composeRule.onNodeWithTag("add_Btn").performClick()
        composeRule.onNodeWithTag("RESULT_TAG").assertTextContains("Result: 11")
    }

    @Test
    fun test_button_has_correct_text() {
        composeRule.onNodeWithTag("add_fields", useUnmergedTree = true).assertTextEquals("Add the fields")
    }

}