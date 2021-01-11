package com.example.quizv02

data class Question (
    val id: Int, // katero vprassanje
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)
