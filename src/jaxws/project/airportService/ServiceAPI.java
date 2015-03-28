package jaxws.project.airportService;

import dataType.jaxb.AirPortStatus;

public abstract class ServiceAPI {

	public static ServiceAPI getAirportInstance(String src){
		if(src == null)
			throw new IllegalArgumentException("src may not be null");
		
		switch (src){
		    case "AirportStatus" : 
			    return new AirportIntance();
			default : 
				throw new RuntimeException("unknown source" + src);
		}
		
	}
	
	public abstract AirPortStatus getAirPortStatus(String code);
}
