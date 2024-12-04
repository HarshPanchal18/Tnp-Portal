package org.mca_two.model;

public class Course {
    int id;
    String name;

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}