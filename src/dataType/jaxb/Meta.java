package dataType.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meta", propOrder = {
    "Credit",
    "Updated",
    "Url"   
})
public class Meta {

	private String Credit;
	private String Updated;
	private String Url;
	
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	public String getUpdated() {
		return Updated;
	}
	public void setUpdated(String updated) {
		Updated = updated;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
}
