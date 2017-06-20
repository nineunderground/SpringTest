package bitwards.model.forecastWeather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import bitwards.model.currentWeather.Coordenate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	private Long id;
	private String name;
	private Coordenate coord;
	private String country;
	private Long population;
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
	public Coordenate getCoord() {
		return coord;
	}
	public void setCoord(Coordenate coord) {
		this.coord = coord;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	
}
