/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mdpf.guiswingorderlinuxmdpf;

/**
 *
 * @author Matteo
 */
public class User {
    private String userName;
    private String password;

    public User(String User, String password) {
        this.userName = User;
        this.password = password;
    }

    public String getUser() {
        return userName;
    }

    public void setUser(String User) {
        this.userName = User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", password=" + password + '}';
    }
    
}
