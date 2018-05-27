package com.example.rishiraij.chatapp;

import java.util.Date;
import java.util.TimeZone;


public class Messages {
    private String messageText;
    private String messageUser;
    private long messageTime;

    public Messages(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        messageTime = new Date().getTime();
    }
    // we won't use the default constructor but we just have it
    public Messages() {
    }
    /*
    The following are getters and setters that are used in the MainActivity.java class
    These store the values for each message
     */
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}