package com.example.quizgame_android.model;

public class Users {
    private String username;

    public Users(String username, String password) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}