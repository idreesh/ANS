package Client;




import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;




import dataType.jaxb.AirPortStatus;
import dataType.jaxb.ObjectFactory;

public class RestClient {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args)   {
		
		try {
			String code = "SFO";
			URL url = new URL("http://services.faa.gov/airport/status/"+ code +"?format=application/xml");
			HttpURLConnection httpconn = (HttpURLConnection) url.openConnection();
			httpconn.setRequestMethod("GET");
			
			if (httpconn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ httpconn.getResponseCode());
			}

		
			
			JAXBContext jaxbc = JAXBContext.newInstance("dataType.jaxb"); 
			
			Unmarshaller u = jaxbc.createUnmarshaller();
			
			JAXBElement<AirPortStatus> airStatus = (JAXBElement<AirPortStatus>) u.unmarshal(httpconn.getInputStream());
			System.out.println(airStatus);
			
			AirPortStatus w = airStatus.getValue();
			System.out.println(w.getWeather().getError());
			
			Marshaller m = jaxbc.createMarshaller();
            m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
            ObjectFactory ob = new ObjectFactory();
            m.marshal( ob.createAirPortStatus(w), System.out );
			
			//close http connection.
			httpconn.disconnect();

			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
