package hbadhani.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Profile {
	Long id;
	String name;
	Date created;
}
