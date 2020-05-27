package com.example.myapp.data.repository

import androidx.lifecycle.LiveData
import com.example.myapp.data.db.entity.WeatherLocation
import com.example.myapp.data.db.unitlocalized.current.UnitCurrentWeatherEntry
import com.example.myapp.data.db.unitlocalized.future.detail.UnitDetailFutureWeatherEntry
import com.example.myapp.data.db.unitlocalized.future.list.UnitFutureWeatherEntry
import org.threeten.bp.LocalDate


interface WeatherRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitCurrentWeatherEntry>

    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<UnitFutureWeatherEntry>>

    suspend fun getFutureWeatherByDate(date: LocalDate, metric: Boolean): LiveData<out UnitDetailFutureWeatherEntry>

    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}