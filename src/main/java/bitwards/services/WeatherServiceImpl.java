package bitwards.services;

import org.springframework.web.client.RestTemplate;

import bitwards.model.currentWeather.CurrentWeather;
import bitwards.model.forecastWeather.ForecastWeather;

public class WeatherServiceImpl implements WeatherService {

	@Override
	public CurrentWeather getCurrentWeather(String endpoint) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(endpoint, CurrentWeather.class);
	}

	@Override
	public ForecastWeather getForecastWeather(String endpoint) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(endpoint, ForecastWeather.class);
	}

}
