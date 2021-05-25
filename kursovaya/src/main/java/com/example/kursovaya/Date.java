package com.example.kursovaya;

public class Date {
    private static int counter = 0;
    private int id;

    private String name;

    public Date(String name) {
        id = ++counter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
