package com.aman.quizapp.domain.repository

import com.aman.quizapp.domain.model.Quiz

interface QuizRepository {

    suspend fun getQuizzes(amount: Int, category: Int, difficulty: String, type: String) : List<Quiz>
}