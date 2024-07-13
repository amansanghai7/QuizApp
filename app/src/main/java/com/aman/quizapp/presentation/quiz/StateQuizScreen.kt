package com.aman.quizapp.presentation.quiz

import com.aman.quizapp.domain.model.Quiz

data class StateQuizScreen (
    val isLoading: Boolean = false,
    val quizState: List<QuizState>  = emptyList(),
    val error: String = "",
    val score: Int = 0
)

data class QuizState(
    val quiz: Quiz ?= null,
    val shuffledOption : List<String> = emptyList(),
    val selectedOptions : Int ?= -1
)


