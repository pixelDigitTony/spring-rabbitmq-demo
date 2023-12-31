package uy.anthony.producer.application;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import uy.anthony.producer.domain.model.Message;
import uy.anthony.producer.infra.MessageSender;

@Controller
public class MessageController {

    private final MessageSender messageSender;


    @Autowired
    public MessageController(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public String sendStringRequest(String requestMessage) {
        String message =  messageSender.sendMessage(requestMessage);
        return "Message sent: " + message;
    }

    public String sendObjectRequest(Message message) {
        ObjectMapper objectMapper = new ObjectMapper();

        String result =  messageSender.sendMessage(objectMapper.valueToTree(message).toString());
        return "Message sent: " + result;
    }
}
