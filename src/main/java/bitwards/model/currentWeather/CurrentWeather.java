package bitwards.model.currentWeather;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import bitwards.model.Weather;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {
	
	private Coordenate coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private Long visibility;
	private Wind wind;
	private Cloud clouds;
	private Long dt;
	private Sys sys;
	private Long id;
	private String name;
	private Integer cod;
	
	public Coordenate getCoord() {
		return coord;
	}
	public void setCoord(Coordenate coord) {
		this.coord = coord;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Long getVisibility() {
		return visibility;
	}
	public void setVisibility(Long visibility) {
		this.visibility = visibility;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Cloud getClouds() {
		return clouds;
	}
	public void setClouds(Cloud clouds) {
		this.clouds = clouds;
	}
	public Long getDt() {
		return dt;
	}
	public void setDt(Long dt) {
		this.dt = dt;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	
	@Override
	public String toString(){
		return "{\"coord\": {\"lon\": " + this.getCoord().getLon() + ",\"lat\": " + this.getCoord().getLat() + "},\"weather\":[{\"id\": " + this.getWeather().get(0).getId() + ",\"main\": \"" + this.getWeather().get(0).getMain() + "\",\"description\": \"" + this.getWeather().get(0).getDescription() + "\",\"icon\": \"" + this.getWeather().get(0).getIcon() + "\"}],\"base\": \"" + this.getBase() + "\",\"main\": {\"temp\": " + this.getMain().getTemp() + ",\"pressure\": " + this.getMain().getPressure() + ",\"humidity\": " + this.getMain().getHumidity() + ",\"temp_min\": " + this.getMain().getTemp_min() + ",\"temp_max\": " + this.getMain().getTemp_max() + "},\"visibility\": " + this.getVisibility() + ",\"wind\": {\"speed\": " + this.getWind().getSpeed() + ",\"deg\": " + this.getWind().getDeg() + "},\"clouds\": {\"all\": " + this.getClouds().getAll() + "},\"dt\": " + this.getDt() + ",\"sys\": {\"type\": " + this.getSys().getType() + ",\"id\": " + this.getSys().getId() + ",\"message\": " + this.getSys().getMessage() + ",\"country\": \"" + this.getSys().getCountry() + "\",\"sunrise\": " + this.getSys().getSunrise() + ",\"sunset\": " + this.getSys().getSunset() + "},\"id\": " + this.getSys().getId() + ",\"name\": \"" + this.getName() + "\",\"cod\": " + this.getCod() + "}";
		//return "\"coord\" : {" + coord.toString() + "}" + weather.get ;
	}
	
}
