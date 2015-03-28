package jaxws.project.airportService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import dataType.jaxb.AirPortStatus;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface AirPortServInt {
	/**
	 * AirPortCode : should be three upper-case letter based on IATA standards. 
	 * e.g SFO = San Franscico , JFK, etc. 
	 * 
	 * **/
	@WebMethod
	public AirPortStatus getAirPortStatus(String AirPortCode);

	@WebMethod
	public AirPortStatus [] getAllRequest();
}
