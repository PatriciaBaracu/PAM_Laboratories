package com.example.myapp.data.network.response

import com.example.myapp.data.db.entity.WeatherLocation
import com.example.myapp.data.network.response.ForecastDaysContainer
import com.google.gson.annotations.SerializedName


data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)