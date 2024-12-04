package org.mca_two.model;

// user
public class User {
    String id;
    String name;
    String password;
    String email;
    int roleId; // #FK - Role

    public User(String id, String name, String password, String email, int roleId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.roleId = roleId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getRoleId() {
        return roleId;
    }
}