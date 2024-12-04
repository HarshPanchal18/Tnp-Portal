package org.mca_two.model;

// role
public class Role {
    int id;
    String title;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Role(int id, String title) {
        this.id = id;
        this.title = title;
    }
}