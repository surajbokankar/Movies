package com.suraj.movies.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.suraj.movies.R
import com.suraj.movies.ui.adapter.MovieAdapter
import com.suraj.movies.ui.viewmodel.MovieViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mAdapter:MovieAdapter
    lateinit var mViewModel:MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        mViewModel=ViewModelProviders.of(this).get(MovieViewModel::class.java)
        mViewModel.getMovies()
        mViewModel.mModels.observe(this, Observer {
            if(it?.data?.isNotEmpty()!!){
                mAdapter= MovieAdapter(this,it?.data)
                movie_list.adapter=mAdapter
            }
        })
    }
}