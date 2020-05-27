package com.example.myapp.data.network.response

import com.example.myapp.data.db.entity.CurrentWeatherEntry
import com.example.myapp.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)