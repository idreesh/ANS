package jaxws.project.airportService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import dataType.jaxb.AirPortStatus;
/**
 * REST service AirPortStatus can be accessed through
 * http://services.faa.gov/airport/status/AirPortcode
 * AirPortcode# valid airport code is based on the IATA standards. (Three letter code)
 * format = to specify the data format retrieved. XML or JSON
 * HTTP verb : GET or POST method. 
 * 
 * **/
public class AirportIntance extends ServiceAPI {

	@SuppressWarnings("unchecked")
	@Override
	public AirPortStatus getAirPortStatus(String code) {
	
		JAXBElement<AirPortStatus> airStatus = null;
		//construct the url resource
		try {
			URL url = new URL("http://services.faa.gov/airport/status/"+ code +"?format=application/xml");
			
			//open a URL http connection 
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//set the connection method "GET"
			con.setRequestMethod("GET");
			
			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : something went wrong : "
						+ con.getResponseCode());
			}
			
			//map the XML doc response to java classes. 
			
             JAXBContext jaxbc = JAXBContext.newInstance("dataType.jaxb"); 
			 Unmarshaller u = jaxbc.createUnmarshaller();

			airStatus = (JAXBElement<AirPortStatus>) u.unmarshal(con.getInputStream());
			System.out.println(airStatus);
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return airStatus.getValue();
		
	}

}
