package com.example.weatherapp.data.entity


import com.google.gson.annotations.SerializedName

data class Sys(
    val country: String,
    val sunrise: Int,
    val sunset: Int
)