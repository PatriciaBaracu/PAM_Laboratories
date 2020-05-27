package com.example.myapp.ui.weather.future.list

import com.example.myapp.data.provider.UnitProvider
import com.example.myapp.data.repository.WeatherRepository
import com.example.myapp.internal.lazyDeferred
import com.example.myapp.ui.base.WeatherViewModel

import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val weatherRepository: WeatherRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(weatherRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        weatherRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
