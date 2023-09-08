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
        amqpTemplate.convertAndSend("amq.direct", "302dc5b2-3670-4df3-a40d-d285ed7da172", message);
        System.out.println("Sent message: " + message);
        return message;
    }

    public String sendMessage2(Object message) {
        amqpTemplate.convertAndSend("amq.direct", "bc1457eb-799e-4564-9622-152af927a0cd", message);
        System.out.println("Sent message: " + message);
        return message.toString();
    }
}
