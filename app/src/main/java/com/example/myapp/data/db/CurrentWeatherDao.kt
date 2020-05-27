package com.example.myapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapp.data.db.entity.CURRENT_WEATHER_ID
import com.example.myapp.data.db.entity.CurrentWeatherEntry
import com.example.myapp.data.db.unitlocalized.current.ImperialCurrentWeatherEntry
import com.example.myapp.data.db.unitlocalized.current.MetricCurrentWeatherEntry



@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)    //when its a conflict because of same id solving through adding a new weather entry replacing old one with new weather entry
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}