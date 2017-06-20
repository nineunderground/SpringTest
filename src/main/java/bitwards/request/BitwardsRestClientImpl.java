package bitwards.request;

import bitwards.model.currentWeather.CurrentWeather;
import bitwards.model.forecastWeather.ForecastWeather;
import bitwards.response.BitwardsResponse;
import bitwards.services.WeatherServiceImpl;

public class BitwardsRestClientImpl implements BitwardsRestClient {
	private static final String serverName = "http://api.openweathermap.org";
	private static final String apiKey = "4b436d940d9e237bb0c9065ff329b13f";
	private static final String currentWeatherEndpoint = serverName + "/data/2.5/weather?q=%s&APPID=" + apiKey;
	private static final String forecastWeatherEndpoint = serverName + "/data/2.5/forecast/daily?q=%s&cnt=%d&APPID=" + apiKey;
	
	private String cityName;
	private Long daysForecast;
	
	public BitwardsRestClientImpl(String cityName, Long daysForecast){
		this.cityName = cityName;
		this.daysForecast = daysForecast;
	}
	
	@Override
	public BitwardsResponse getResponse(){
		WeatherServiceImpl weatherServ = new WeatherServiceImpl();
		CurrentWeather currentWeatherServResp = weatherServ.getCurrentWeather(String.format(currentWeatherEndpoint, cityName));
		ForecastWeather forecastWeatherServResp = weatherServ.getForecastWeather(String.format(forecastWeatherEndpoint, cityName, daysForecast));
		return new BitwardsResponse( currentWeatherServResp, forecastWeatherServResp);
	}

}
