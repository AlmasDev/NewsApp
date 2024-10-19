package com.example.newsapi.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapi.NewsAPI
import com.example.newsapi.NewsApiBuilder
import com.example.newsapi.models.Article
import kotlinx.coroutines.launch

class NewsScreenViewModel() : ViewModel() {

    var articles by mutableStateOf<List<Article>>(emptyList())

    init {
        getNewsArticles()
    }

    private fun getNewsArticles() {
        viewModelScope.launch {
            val result = NewsApiBuilder.api.getNews()
            articles = result.articles
        }
    }

}