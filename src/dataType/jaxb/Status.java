package dataType.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", propOrder = {
    "Reason",
    "ClosureBegin",
    "EndTime",
    "MindDelay",
    "AvgDelay",
    "MaxDelay",
    "ClosureEnd",
    "Trend",
    "Type"
})
public class Status {
	private String Reason;
	 @XmlElement(nillable = true)
	private String ClosureBegin;
	 @XmlElement(nillable = true)
	private String EndTime;
	 @XmlElement(nillable = true)
	private String MindDelay;
	 @XmlElement(nillable = true)
	private String AvgDelay;
	 @XmlElement(nillable = true)
	private String MaxDelay;
	 @XmlElement(nillable = true)
	private String ClosureEnd;
	 @XmlElement(nillable = true)
	private String Trend;
	 @XmlElement(nillable = true)
	private String Type;
	
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getClosureBegin() {
		return ClosureBegin;
	}
	public void setClosureBegin(String closureBegin) {
		ClosureBegin = closureBegin;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public String getMindDelay() {
		return MindDelay;
	}
	public void setMindDelay(String mindDelay) {
		MindDelay = mindDelay;
	}
	public String getAvgDelay() {
		return AvgDelay;
	}
	public void setAvgDelay(String avgDelay) {
		AvgDelay = avgDelay;
	}
	public String getMaxDelay() {
		return MaxDelay;
	}
	public void setMaxDelay(String maxDelay) {
		MaxDelay = maxDelay;
	}
	public String getClosureEnd() {
		return ClosureEnd;
	}
	public void setClosureEnd(String closureEnd) {
		ClosureEnd = closureEnd;
	}
	public String getTrend() {
		return Trend;
	}
	public void setTrend(String trend) {
		Trend = trend;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	

}
