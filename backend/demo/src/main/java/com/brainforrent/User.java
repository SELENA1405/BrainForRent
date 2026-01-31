package com.brainforrent;

import java.util.*;

abstract class User {
    protected String userId;
    protected String name;
    protected String email;
    protected String role;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }
}
