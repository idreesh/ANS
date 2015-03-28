package Client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import dataType.jaxb.AirPortStatus;
import dataType.jaxb.ObjectFactory;

import jaxws.project.airportService.AirPortServInt;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://localhost:8080/axis2/services/AirPortSerImplService?wsdl");
			
			QName qname = new QName("http://airportService.project.jaxws/", "AirPortSerImplService");
			QName pname = new QName("http://airportService.project.jaxws/","AirPortSerImplPort");
			
			Service service = Service.create(url, qname);
			
			AirPortServInt port = service.getPort(pname, AirPortServInt.class);
			System.out.println(port);
			
		//	AirPortStatus ars1 = port.getAirPortStatus("BOS");
			AirPortStatus[] ars = port.getAllRequest();
			//System.out.println(ars.getStatus().getReason());
			
       
			JAXBContext jaxbc = JAXBContext.newInstance("dataType.jaxb");
			Marshaller m = jaxbc.createMarshaller();
			m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
			
			
			for(int i = 0 ; i < ars.length;i++){
				System.out.println("====================="+ars[i].getIATA()+"========================");
            ObjectFactory ob = new ObjectFactory();
            m.marshal( ob.createAirPortStatus(ars[i]), System.out );
		}
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
