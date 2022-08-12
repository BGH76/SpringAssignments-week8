package org.example;

public class Phone {

    private String mob;

    public String getMob() {
        return mob = "777-555-3333";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
