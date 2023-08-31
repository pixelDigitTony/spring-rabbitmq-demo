package uy.anthony.producer.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import uy.anthony.producer.infra.MessageSender;

@Controller
public class MessageController {

    private final MessageSender messageSender;

    @Autowired
    public MessageController(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public String sendRequest(String requestMessage) {
        String message =  messageSender.sendMessage(requestMessage);
        return "Message sent: " + message;
    }
}
