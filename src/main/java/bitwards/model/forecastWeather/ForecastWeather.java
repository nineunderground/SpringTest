package bitwards.model.forecastWeather;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import bitwards.model.currentWeather.CurrentWeather;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastWeather {
	
	private City city;
	private String cod;
	private Double message;
	private Integer cnt;
	private List<ForecastNode> list;
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public Double getMessage() {
		return message;
	}
	public void setMessage(Double message) {
		this.message = message;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public List<ForecastNode> getList() {
		return list;
	}
	public void setList(List<ForecastNode> list) {
		this.list = list;
	}
	@Override
	public String toString(){
		StringBuffer result = new StringBuffer("{\n\"city\": {\n\"id\": " + this.getCity().getId() + ",\n\"name\": \"" + this.getCity().getName() + "\",\n\"coord\": {\n\"lon\": " + this.getCity().getCoord().getLon() + ",\n\"lat\": " + this.getCity().getCoord().getLat() + "\n},\n\"country\": \"" + this.getCity().getCountry() + "\",\n\"population\": " + this.getCity().getPopulation() + "\n},\n\"cod\": \"" + this.getCod() + "\",\n\"message\": " + this.getMessage() + ",\n\"cnt\": " + this.getCnt() + ",\n\"list\": ");
		for(ForecastNode forecast : this.list){
			String weatherLine = "[\n{\n\"dt\": " + forecast.getDt() + ",\n\"temp\": {\n\"day\": 294.04,\n\"min\": 289.1,\n\"max\": 294.16,\n\"night\": 289.1,\n\"eve\": 292.67,\n\"morn\": 290.63\n},\n\"pressure\": 1018.68,\n\"humidity\": 66,\n\"weather\": [\n{\n\"id\": 802,\n\"main\": \"Clouds\",\n\"description\": \"scattered clouds\",\n\"icon\": \"03d\"\n}\n] ,\n\"speed\": 2.51,\n\"deg\": 360,\n\"clouds\": 32\n},\n]\n}";
			result.append(weatherLine);
		}
		return result.toString();
	}
	
}
