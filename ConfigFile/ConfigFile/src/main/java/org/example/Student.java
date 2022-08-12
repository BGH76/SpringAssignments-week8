package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {

    private int id = 8;
    private String name = "Brian Houts";
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public Address getAdd() {
        return add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
