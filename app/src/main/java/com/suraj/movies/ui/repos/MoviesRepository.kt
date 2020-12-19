package com.suraj.movies.ui.repos

import androidx.lifecycle.MutableLiveData
import com.suraj.movies.network.ApiInterface
import com.suraj.movies.network.RetrofitClient
import com.suraj.movies.ui.model.MovieParent
import com.suraj.movies.ui.model.TestData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object MoviesRepository {

    fun loadMovies(model:MutableLiveData<MovieParent>){
        var apiInterface: ApiInterface = RetrofitClient.getService(ApiInterface::class.java)
        GlobalScope.launch(Dispatchers.Main) {
            val res=apiInterface.getMovies()
            if(res!=null){
                model.postValue(res)
            }else{
                model.postValue(null)
            }
        }
    }
}