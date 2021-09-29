package com.iteesoft.chatapp;


import lombok.Data;

@Data
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;
}
