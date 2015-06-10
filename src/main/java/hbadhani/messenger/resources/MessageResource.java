package hbadhani.messenger.resources;

import java.util.Date;
import java.util.List;
import java.util.Random;

import hbadhani.messenger.model.Message;
import hbadhani.messenger.service.MessageService;
import org.glassfish.jersey.message.internal.MediaTypeProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	MessageService msgSrv = new MessageService();

	@GET
	@Produces("application/json")
	public List<Message> getMessages(){
		return msgSrv.getAllMessages();
	}

	@Path("/{messageId}")
	@GET
	@Produces("application/json")
	public Message getMessage(@PathParam("messageId") long id){
		return msgSrv.getMessage(id);
	}

	@POST
	@Consumes("application/json")
	@Produces("text/html")
	public String addMessage(Message message){
		message.setCreated(new Date());
		message.setId(new Random().nextInt());
		if(msgSrv.addMessage(message))
			return "Message Posted";
		else
			return "Failed to post message";
	}

	@PUT
	@Path("/{messageId}")
	@Consumes("application/json")
	@Produces("text/html")
	public String updateMessage(Message message,@PathParam("messageId") long id){
		message.setId(id);
		message.setCreated(new Date());
		if(msgSrv.replaceMessage(message))
			return "Message Updated";
		else
			return "Failed to update message";

	}

	@DELETE
	@Path("/{messageId}")
	@Produces("text/html")
	public String deleteMessage(@PathParam("messageId") long id){
		if(msgSrv.deleteMessage(id))
			return "Message Deleted";
		else
			return "Failed to delete message";

	}

}
