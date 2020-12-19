package com.suraj.movies.ui.model

import com.google.gson.annotations.SerializedName

data class MovieParent(
    @SerializedName("TestData")
    val data: ArrayList<TestData>
)