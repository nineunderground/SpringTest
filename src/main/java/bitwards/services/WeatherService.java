package bitwards.services;

import bitwards.model.currentWeather.CurrentWeather;
import bitwards.model.forecastWeather.ForecastWeather;

public interface WeatherService {
	
	CurrentWeather getCurrentWeather(String endpoint);
	
	ForecastWeather getForecastWeather(String endpoint);

}
