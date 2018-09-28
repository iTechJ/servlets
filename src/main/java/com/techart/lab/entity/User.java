package com.techart.lab.entity;

/**
 * Created by alexander on 3/5/17.
 */
public class User {

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private String login;

    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
