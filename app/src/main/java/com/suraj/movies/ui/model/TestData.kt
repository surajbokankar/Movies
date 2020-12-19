package com.suraj.movies.ui.model

import android.graphics.Bitmap
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

data class TestData(
    val created_on: String,
    val description: String,
    val id: Int,
    val name: String,
    val payment_plan: String,
    val posterLink: String,
    val release_year: String,
    val shortDescription: String,
    val type: String,
    val updated_on: String,
    val video_duration: String
){
    companion object {
        @JvmStatic
        @BindingAdapter("itemView")
        fun setItemView(view: AppCompatImageView, data: String) {
            try {
                Glide.with(view.context).load(data)
                    .into(view)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}