package com.aman.quizapp.data.repository

import android.util.Log
import com.aman.quizapp.data.remote.QuizApi
import com.aman.quizapp.domain.model.Quiz
import com.aman.quizapp.domain.repository.QuizRepository

class QuizRepositoryImpl(
    private val quizApi: QuizApi
) : QuizRepository {
    override suspend fun getQuizzes(
        amount: Int,
        category: Int,
        difficulty: String,
        type: String,
    ): List<Quiz> {

        val rsp = quizApi.getQuizzes(amount, category, difficulty, type).results
        Log.d("quiz", rsp.toString())
        return rsp


    }
}