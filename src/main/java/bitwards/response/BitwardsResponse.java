package bitwards.response;

import bitwards.model.currentWeather.CurrentWeather;
import bitwards.model.forecastWeather.ForecastWeather;

public class BitwardsResponse {
	
	private final String content;

    public BitwardsResponse(CurrentWeather currentWeatherResponse, ForecastWeather forecastWeatherResponse) {
        this.content = currentWeatherResponse.toString() + "\n"  + forecastWeatherResponse.toString();
    }

	public String getContent() {
        return content;
    }

}
