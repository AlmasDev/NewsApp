package com.example.newsapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsApiBuilder {

    val api: NewsAPI by lazy {
        Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsAPI::class.java)
    }
}