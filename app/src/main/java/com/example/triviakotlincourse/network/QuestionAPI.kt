package com.example.triviakotlincourse.network

import com.example.triviakotlincourse.model.Questions
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionsAPI {
    @GET("world.json")
    suspend fun getAllQuestions(): Questions
}