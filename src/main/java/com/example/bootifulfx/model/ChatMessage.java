package com.example.bootifulfx.model;

import lombok.Builder;
import lombok.Getter;

@Builder
public class ChatMessage {

    @Getter
    private MessageType type;
    @Getter
    private String content;
    @Getter
    private String sender;
    @Getter
    private String time;  //he uses momentJS to create a timestamp, we might need to change this to *Date

}
