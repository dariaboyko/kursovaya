package com.example.kursovaya;

import java.util.ArrayList;

public class Value {

    private static int counter = 0;
    private int id;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String name) {
        this.value = name;
    }
    public Value(String value) {
        id = ++counter;
        this.value = value;
    }
    public int getId() {
        return id;
    }


}
