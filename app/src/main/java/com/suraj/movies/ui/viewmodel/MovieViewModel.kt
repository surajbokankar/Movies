package com.suraj.movies.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.suraj.movies.ui.model.MovieParent
import com.suraj.movies.ui.model.TestData
import com.suraj.movies.ui.repos.MoviesRepository

class MovieViewModel:ViewModel() {
    private val mList=MutableLiveData<MovieParent>()
    fun getMovies(){
        MoviesRepository.loadMovies(mList)
}
    val mModels=mList
}