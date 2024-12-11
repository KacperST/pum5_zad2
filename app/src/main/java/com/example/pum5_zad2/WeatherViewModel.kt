package com.example.pum5_zad2

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

// DONT TOUCH
class WeatherViewModel : ViewModel() {
    val weather = ObservableField<Weather>()

    private val repository = WeatherRepository()

    private val allWeatherData = repository.getWeather()


    fun searchWeather(query: String) {
        val foundWeather = allWeatherData.find { it.city.equals(query, ignoreCase = true) }
        weather.set(foundWeather)  // Set the result to the ObservableField
    }
}
