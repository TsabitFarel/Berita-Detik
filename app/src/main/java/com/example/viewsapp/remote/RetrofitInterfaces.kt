package com.example.viewsapp.remote

import com.example.viewsapp.remote.pojo.ResponseNews
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Imam Fahrur Rofi on 20/07/2020.
 */
interface RetrofitInterfaces {

    // Base URL : https://newsapi.org/
    // Get URL Path : v2/top-headlines
    // Hingga menjadi
    // https://newsapi.org/v2/top-headlines
    @GET("v2/top-headlines")
    suspend fun topHeadlines(
        // Menambah Query country
        // sehingga url menjadi
        // https://newsapi.org/v2/top-headlines?country=id
        @Query("country") country: String
    ): Response<ResponseNews>
}