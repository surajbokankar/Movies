package com.suraj.movies.ui.adapter

import android.content.Context
import com.suraj.edelivery.base.GenericAdapter
import com.suraj.movies.R
import com.suraj.movies.databinding.ListItemDetailBinding
import com.suraj.movies.databinding.ListMovieItemBinding
import com.suraj.movies.ui.model.TestData

class MovieAdapter(context: Context,list:ArrayList<TestData>):GenericAdapter<TestData,ListItemDetailBinding>(context,list) {
    override val layoutResId: Int
        get() = R.layout.list_item_detail

    override fun onBindData(model: TestData, position: Int, dataBinding: ListItemDetailBinding) {
        dataBinding.item=model
    }

    override fun onItemClick(model: TestData, position: Int) {
        /*TODO("Not yet implemented")*/
    }
}