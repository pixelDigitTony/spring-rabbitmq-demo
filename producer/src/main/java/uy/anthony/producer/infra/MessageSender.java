package uy.anthony.producer.infra;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private final AmqpTemplate amqpTemplate;

    @Autowired
    public MessageSender(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public String sendMessage(String message) {
        amqpTemplate.convertAndSend("amq.direct", "123456", message);
        System.out.println("Sent message: " + message);
        return message;
    }
}
