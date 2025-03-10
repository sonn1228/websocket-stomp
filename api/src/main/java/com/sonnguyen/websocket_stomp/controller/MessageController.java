package com.sonnguyen.websocket_stomp.controller;

import com.sonnguyen.websocket_stomp.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/chat") // Khi client gửi message tới /app/chat
    @SendTo("/topic/messages") // Gửi tới tất cả subscribers của /topic/messages
    public Message sendMessage(Message message) {
        return new Message("Server: " + message.getContent());
    }
}