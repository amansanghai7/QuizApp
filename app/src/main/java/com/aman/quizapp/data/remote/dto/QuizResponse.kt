package com.aman.quizapp.data.remote.dto

import com.aman.quizapp.domain.model.Quiz

data class QuizResponse(
    val response_code: Int,
    val results: List<Quiz>
)