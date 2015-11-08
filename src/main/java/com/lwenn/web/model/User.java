package com.lwenn.web.model;

/**
 * Created by lwenn on 15/11/1.
 */
public class User {

    private int userId;
    private String userName;
    private String userPassword;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }
}
