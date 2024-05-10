package xmlUtility.xmlNode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

    @XmlElement(name = "deviceName")
    public String deviceName;
    @XmlElement(name = "udId")
    public String udId;
    @XmlElement(name = "platformName")
    public String platformName;
    @XmlElement(name = "platformVersion")
    public String platformVersion;



}
