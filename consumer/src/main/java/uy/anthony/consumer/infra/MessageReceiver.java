package uy.anthony.consumer.infra;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import uy.anthony.consumer.domain.model.Message;

import java.io.IOException;

@Component
public class MessageReceiver {

    @RabbitListener(queues = "consumer1")
    public void receiveMessage(String message) throws IOException {
        System.out.println("Received message: " + message);
    }

    @RabbitListener(queues = "consumer2")
    public void receiveObjectMessage(String message) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Message messageObject = objectMapper.readValue(message, Message.class);
        System.out.println("Received message: " + messageObject.getMessage());
    }

}
