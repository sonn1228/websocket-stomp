package com.sonnguyen.websocket_stomp.model;

public class Message {
    private String content;

    public Message() {}

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}