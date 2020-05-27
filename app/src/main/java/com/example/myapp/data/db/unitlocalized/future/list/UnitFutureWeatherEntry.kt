package com.example.myapp.data.db.unitlocalized.future.list

import org.threeten.bp.LocalDate


interface UnitFutureWeatherEntry {
    val date: LocalDate
    val avgTemperature: Double
    val conditionText: String
    val conditionIconUrl: String
}