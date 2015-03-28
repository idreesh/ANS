package dataType.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportStatus", propOrder = {
    "Delay",
    "IATA",
    "State",
    "Name",
    "Weather",
    "ICAO",
    "City",
    "Status"
})
public class AirPortStatus {
	
	private String Delay;
	private String IATA;
	private String State;
	private String Name; 
	private Weather Weather;
	private String ICAO;
	private String City;
	private Status Status;
	
	public String getDelay() {
		return Delay;
	}

	public void setDelay(String delay) {
		Delay = delay;
	}

	public String getIATA() {
		return IATA;
	}

	public void setIATA(String iATA) {
		IATA = iATA;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	

	public String getICAO() {
		return ICAO;
	}

	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status status) {
		Status = status;
	}

	public Weather getWeather() {
		return Weather;
	}

	public void setWeather(Weather weather) {
		this.Weather = weather;
	}

	

}
