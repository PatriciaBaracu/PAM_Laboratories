package com.example.myapp.ui.base

import androidx.lifecycle.ViewModel
import com.example.myapp.data.provider.UnitProvider
import com.example.myapp.data.repository.WeatherRepository
import com.example.myapp.internal.UnitSystem
import com.example.myapp.internal.lazyDeferred


abstract class WeatherViewModel(
    private val weatherRepository: WeatherRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        weatherRepository.getWeatherLocation()
    }
}