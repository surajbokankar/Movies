package com.suraj.movies.network

import com.suraj.movies.ui.model.MovieParent
import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiInterface {
    @GET("movies")
    suspend fun getMovies(): MovieParent
}