package dataType.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weather", propOrder = {
    "Visibility",
    "Weather",
    "Meta",
    "Temp",
    "Wind",
    "Error"
   
})
public class Weather {
	private String Visibility;
	private String Weather;
	private Meta Meta;
	private String Temp;
	private String Wind;
	private String Error;

	public String getVisibility() {
		return Visibility;
	}

	public void setVisibility(String visibility) {
		Visibility = visibility;
	}

	public Meta getMeta() {
		return Meta;
	}

	public void setMeta(Meta meta) {
		Meta = meta;
	}

	

	public String getTemp() {
		return Temp;
	}

	public void setTemp(String temp) {
		Temp = temp;
	}

	public String getWind() {
		return Wind;
	}

	public void setWind(String wind) {
		Wind = wind;
	}

	public String getWeather() {
		return Weather;
	}

	public void setWeather(String climate) {
		Weather = climate;
	}

	public String getError() {
		return Error;
	}

	public void setError(String error) {
		Error = error;
	}

}
