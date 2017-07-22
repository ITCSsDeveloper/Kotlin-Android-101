package com.example.win8.myapplication;

/**
 * Created by win8 on 7/22/2017.
 */

public class LoginJava {
    public LoginJava(String username, String password) {
        this.username = username;
        Password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String username ;
    private String Password;



}
