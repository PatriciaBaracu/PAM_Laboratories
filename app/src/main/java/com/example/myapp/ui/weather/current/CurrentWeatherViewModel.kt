package com.example.myapp.ui.weather.current

import com.example.myapp.data.provider.UnitProvider
import com.example.myapp.data.repository.WeatherRepository
import com.example.myapp.internal.lazyDeferred
import com.example.myapp.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val weatherRepository: WeatherRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(weatherRepository, unitProvider) {

    val weather by lazyDeferred {
        weatherRepository.getCurrentWeather(super.isMetricUnit)   // lazy give possibility not to initialized instantly with currentweatherviewmodel, but to wait until is called
    }
}
