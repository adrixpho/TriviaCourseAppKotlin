package com.example.triviakotlincourse.repository

import android.util.Log
import com.example.triviakotlincourse.data.DataOrException
import com.example.triviakotlincourse.model.QuestionItem
import com.example.triviakotlincourse.network.QuestionsAPI
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionsAPI) {
    private val dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()

            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

        } catch (e : Exception) {
            dataOrException.e = e
            Log.d("TAG EXC", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")
        }

        return dataOrException
    }
}