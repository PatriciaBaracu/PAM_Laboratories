package com.example.myapp.data.db.unitlocalized.current


interface UnitCurrentWeatherEntry {

    val conditionText: String
    val conditionIconUrl: String
    val windSpeed: Double
    val windDirection: String
    val precipitationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
    val temperature: Double
}