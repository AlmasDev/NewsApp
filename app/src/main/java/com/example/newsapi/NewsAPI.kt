package com.example.newsapi

import com.example.newsapi.models.News
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("top-headlines")
    suspend fun getNews(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = "fe5758857b0e4963afac32b8360084f2"
    ) : News
}