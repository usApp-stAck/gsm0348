//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 04:14:20 PM MSD 
//

package org.opentelecoms.gsm0348.api.model;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsePacketHeader", propOrder = {
    "responseStatus"
})
public class ResponsePacketHeader
    extends SecurityHeader
{

    @XmlElement(name = "ResponseStatus", required = true)
    protected ResponsePacketStatus responseStatus;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePacketStatus }
     *     
     */
    public ResponsePacketStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePacketStatus }
     *     
     */
    public void setResponseStatus(ResponsePacketStatus value) {
        this.responseStatus = value;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((responseStatus == null) ? 0 : responseStatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ResponsePacketHeader))
			return false;
		ResponsePacketHeader other = (ResponsePacketHeader) obj;
		if (responseStatus != other.responseStatus) {
			return false;
		}
		if (!Arrays.equals(counter, other.counter)) {
			return false;
		}
		if (!Arrays.equals(tar, other.tar)) {
			return false;
		}
		if (paddingCounter != other.paddingCounter) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponsePacketHeader [responseStatus=");
		builder.append(responseStatus);
		builder.append(", tar=");
		builder.append(Arrays.toString(tar));
		builder.append(", paddingCounter=");
		builder.append(paddingCounter);
		builder.append(", security=");
		builder.append(Arrays.toString(security));
		builder.append(", counter=");
		builder.append(Arrays.toString(counter));
		builder.append("]");
		return builder.toString();
	}

}