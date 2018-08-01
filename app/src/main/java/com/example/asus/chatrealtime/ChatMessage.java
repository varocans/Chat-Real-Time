package com.example.asus.chatrealtime;

import java.util.Date;

public class ChatMessage {
    private String MessageText;
    private String MessageUser;
    private long MessageTime;

    public ChatMessage(String messageText, String messageUser) {
        MessageText = messageText;
        MessageUser = messageUser;
        MessageTime = new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageText() {
        return MessageText;
    }

    public void setMessageText(String messageText) {
        MessageText = messageText;
    }

    public String getMessageUser() {
        return MessageUser;
    }

    public void setMessageUser(String messageUser) {
        MessageUser = messageUser;
    }

    public long getMessageTime() {
        return MessageTime;
    }

    public void setMessageTime(long messageTime) {
        MessageTime = messageTime;
    }
}
