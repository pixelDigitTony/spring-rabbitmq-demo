package uy.anthony.producer.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uy.anthony.producer.domain.model.Message;

@SpringBootTest
class MessageControllerTest {

    @Autowired
    MessageController messageController;

    @Test
    void sendRequest() {
        String message = "Hello World!";
        messageController.sendStringRequest(message);
    }

    @Test
    void sendObjectRequest() {
        Message message = new Message("Hello World!");
        messageController.sendObjectRequest(message);
    }
}