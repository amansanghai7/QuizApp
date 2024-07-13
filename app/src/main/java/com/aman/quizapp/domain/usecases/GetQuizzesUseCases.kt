package com.aman.quizapp.domain.usecases

import com.aman.quizapp.common.Resource
import com.aman.quizapp.domain.model.Quiz
import com.aman.quizapp.domain.repository.QuizRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.util.concurrent.Flow

class GetQuizzesUseCases(val quizRepository: QuizRepository) {

    operator fun invoke(amount: Int,
                   category: Int,
                   difficulty: String,
                   type: String
    ): kotlinx.coroutines.flow.Flow<Resource<List<Quiz>>> = flow {

        emit(Resource.Loading())

        try {
            emit(Resource.Success(data = quizRepository.getQuizzes(amount, category, difficulty, type)))
        }catch (e: Exception){
            emit(Resource.Error(message = e.message.toString()))
        }


    }.flowOn(Dispatchers.IO)

}