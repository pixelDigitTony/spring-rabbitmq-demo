package uy.anthony.consumer.infra;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MessageReceiver {

    @RabbitListener(queues = "consumer1")
    public void receiveMessage(String message) throws IOException {
        System.out.println("Received message: " + message);
    }

}
