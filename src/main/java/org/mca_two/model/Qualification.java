package org.mca_two.model;

// qualification
public class Qualification {
    int id;
    String name;

    public Qualification(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}