package com.example.chatapplication_firebase;

public class message {
    String name;
    String message;

    message(){

    }


    public message(String name,String message) {
        this.name = name;
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
