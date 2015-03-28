
package jaxws.project.airportService.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllRequestResponse", namespace = "http://airportService.project.jaxws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllRequestResponse", namespace = "http://airportService.project.jaxws/")
public class GetAllRequestResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private dataType.jaxb.AirPortStatus[] _return;

    /**
     * 
     * @return
     *     returns AirPortStatus[]
     */
    public dataType.jaxb.AirPortStatus[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(dataType.jaxb.AirPortStatus[] _return) {
        this._return = _return;
    }

}
