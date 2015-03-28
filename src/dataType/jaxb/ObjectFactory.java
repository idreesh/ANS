package dataType.jaxb;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

	private final static QName _AirPortStatus_QNAME = new QName("", "AirportStatus");
	private final static QName _Weather_QNAME = new QName("", "Weather");
	private final static QName _Status_QNAME = new QName("", "Status");
	private final static QName _Meta_QNAME = new QName("", "Meta");
	
	public ObjectFactory() {
    }
	
	 /**
     * Create an instance of {@link AirPortStatus }
     * 
     */
	public AirPortStatus createAirPortStatus(){
		return new AirPortStatus();
		
	}
	
	/**
     * Create an instance of {@link Weather }
     * 
     */
	public Weather createWeather(){
		return new Weather();
		
	}
	
	/**
     * Create an instance of {@link Status }
     * 
     */
	public Status createStatus(){
		return new Status();
		
	}
	
	/**
     * Create an instance of {@link Meta }
     * 
     */
	public Meta createMeta(){
		return new Meta();
		
	}
	
	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AirportStatus")
    public JAXBElement<AirPortStatus> createAirPortStatus(AirPortStatus value) {
        return new JAXBElement<AirPortStatus>(_AirPortStatus_QNAME, AirPortStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Weather")
    public JAXBElement<Weather> createAirPortStatus(Weather value) {
        return new JAXBElement<Weather>(_Weather_QNAME, Weather.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Status")
    public JAXBElement<Status> createAirPortStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Meta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Meta")
    public JAXBElement<Meta> createAirPortStatus(Meta value) {
        return new JAXBElement<Meta>(_Meta_QNAME, Meta.class, null, value);
    }
	
	
}
