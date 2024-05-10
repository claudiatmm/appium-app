package xmlUtility.xmlNode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ServerConfiguration {

    @XmlElement(name = "IPaddress")
    public String IPaddress;
    @XmlElement(name = "port")
    public String port;


}
