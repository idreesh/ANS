package jaxws.project.airportService;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.jws.WebService;

import dataType.jaxb.AirPortStatus;

@WebService(endpointInterface = "jaxws.project.airportService.AirPortServInt",
wsdlLocation="META-INF/AirPortSerImplService.wsdl"
            )
public class AirPortSerImpl implements AirPortServInt  {

	private  static Map<String, AirPortStatus> map;
	public AirPortSerImpl (){
		if(map == null){
			map = new HashMap<String,AirPortStatus>();
		}
	}
	
	@Override
	public AirPortStatus getAirPortStatus(String AirPortCode) {
		if(map.isEmpty()){
			ServiceAPI impl = ServiceAPI.getAirportInstance("AirportStatus");
			AirPortStatus ars = new AirPortStatus();
			ars = impl.getAirPortStatus(AirPortCode);
			map.put(ars.getIATA(), ars);
			System.out.println("case empty");
			return ars;
		}
		if(map.get(AirPortCode) == null){
			ServiceAPI impl = ServiceAPI.getAirportInstance("AirportStatus");
			AirPortStatus ars = new AirPortStatus();
			ars = impl.getAirPortStatus(AirPortCode);
			map.put(ars.getIATA(), ars);
			System.out.println("case null");
			return ars;
		}
		
		/**
		 * probably it looks the map collection here is useless, but I am using it here
		 * only to store reports for history retrieval, and to make sure those report will be
		 * updated any time we request the same information about a specific airport.
		 * */
			System.out.println("case report exists, replace it");
			map.remove(AirPortCode);
			
			ServiceAPI impl = ServiceAPI.getAirportInstance("AirportStatus");
			AirPortStatus ars = new AirPortStatus();
			ars = impl.getAirPortStatus(AirPortCode);
			map.put(ars.getIATA(), ars);
			return ars;
		
		
		
	}

	@Override
	public AirPortStatus[] getAllRequest() {
		if(map.isEmpty()){
			throw new RuntimeException("there are no requests made yet!");
		}
		
		int size = map.size();
		AirPortStatus [] ars = new AirPortStatus[size];
		int i = 0;
		Iterator<AirPortStatus> it = map.values().iterator();
		
		while(it.hasNext()){
			ars[i] = it.next();
			i++;
		}
		
		return ars;
	}

}
