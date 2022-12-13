package com.example.triviakotlincourse.screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.triviakotlincourse.components.QuestionsView

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = viewModel()) {
    QuestionsView(viewModel)
}