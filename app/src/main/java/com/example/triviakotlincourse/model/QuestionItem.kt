package com.example.triviakotlincourse.model

data class QuestionItem(
    val question: String,
    val choices: List<String>,
    val answer: String,
    val category: String
)