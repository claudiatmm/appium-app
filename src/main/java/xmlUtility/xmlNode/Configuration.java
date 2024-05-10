package xmlUtility.xmlNode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "configuration")
public class Configuration {

    @XmlElement(name = "serverConfiguration")
    public ServerConfiguration serverConfiguration;

    @XmlElement(name = "capabilities")
    public Capabilities capabilities;

}
