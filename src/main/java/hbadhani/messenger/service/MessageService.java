package hbadhani.messenger.service;

import hbadhani.messenger.database.DatabaseClass;
import hbadhani.messenger.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MessageService {
	static List<Message> list = new ArrayList<Message>();
	public List<Message> getAllMessages(){
		return DatabaseClass.getAllMessages();
	}

	public boolean addMessage(Message message){
		return DatabaseClass.addMessage(message);
	}

	public boolean deleteMessage(long id){
		return DatabaseClass.deleteMessage(id);
	}

	public boolean replaceMessage(Message message) {
		return DatabaseClass.replaceMessage(message);
	}

	public Message getMessage(long id) {
		return DatabaseClass.getMessage(id);
	}
}
