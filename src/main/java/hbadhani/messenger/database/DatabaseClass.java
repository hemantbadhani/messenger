package hbadhani.messenger.database;

import hbadhani.messenger.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseClass {
	private static Map<Long,Message> messages = new HashMap();
	private static Map<String,Profile> profiles = new HashMap();

	public static Map<Long,Message> getMessages(){
		return messages;
	}
	public static Map<String,Profile> getProfiles(){
		return profiles;
	}

	public static boolean addMessage(Message message) {

		if(message == null)
			return false;

		//Check if message id already exists
		if(getMessage(message.getId()) != null)
			return false;

		if(null != messages.put(message.getId(), message))
			return false;
		return true;
	}
	public static Message getMessage(Long id){
		return messages.get(id);
	}
	public static List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}

	public static boolean deleteMessage(long id) {
		if(null == messages.remove(id))
			return false;
		return true;
	}

	public static boolean replaceMessage(Message message){
		if(null == message)
				return false;
		if(null == messages.get(message.getId()))
			return false;
		if(null != messages.replace(message.getId(),message))
			return true;
		return false;
	}
}
