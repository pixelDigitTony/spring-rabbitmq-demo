package uy.anthony.producer.domain.model;

public class Message {
    private String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}