package bitwards.model.forecastWeather;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import bitwards.model.Weather;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastNode {
	
	private Long dt;
	private Average temp;
	private Float pressure;
	private Integer humidity;
	private List<Weather> weather;
	private Float speed;
	private Integer deg;
	private Integer clouds;
	public Long getDt() {
		return dt;
	}
	public void setDt(Long dt) {
		this.dt = dt;
	}
	public Average getTemp() {
		return temp;
	}
	public void setTemp(Average temp) {
		this.temp = temp;
	}
	public Float getPressure() {
		return pressure;
	}
	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public Float getSpeed() {
		return speed;
	}
	public void setSpeed(Float speed) {
		this.speed = speed;
	}
	public Integer getDeg() {
		return deg;
	}
	public void setDeg(Integer deg) {
		this.deg = deg;
	}
	public Integer getClouds() {
		return clouds;
	}
	public void setClouds(Integer clouds) {
		this.clouds = clouds;
	}

}
