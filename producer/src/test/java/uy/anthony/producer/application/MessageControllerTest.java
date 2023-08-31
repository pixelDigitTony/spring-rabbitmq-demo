package uy.anthony.producer.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageControllerTest {

    @Autowired
    MessageController messageController;

    @Test
    void sendRequest() {
        String message = "Hello World!";
        messageController.sendRequest(message);
    }
}