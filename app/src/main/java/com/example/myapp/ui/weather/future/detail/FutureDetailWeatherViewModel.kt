package com.example.myapp.ui.weather.future.detail

import com.example.myapp.data.provider.UnitProvider
import com.example.myapp.data.repository.WeatherRepository
import com.example.myapp.internal.lazyDeferred
import com.example.myapp.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val weatherRepository: WeatherRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(weatherRepository, unitProvider) {

    val weather by lazyDeferred {
        weatherRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
