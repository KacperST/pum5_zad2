package com.example.pum5_zad2

class WeatherRepository {
    fun getWeather(): List<Weather> {
        return listOf(
            Weather(
                temperature = 24.0,
                description = "Partly Cloudy",
                city = "Krakow"
            ),
            Weather(
                temperature = 25.0,
                description = "Clear Sky",
                city = "Warszawa"
            ),
            Weather(
                temperature = 26.0,
                description = "Sunny",
                city = "Zakopane"
            )
        )
    }
}