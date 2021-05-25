package com.example.kursovaya;

import java.util.ArrayList;
import java.util.Objects;

public class Currency {



    private static int counter = 0;
    private int id;
    private String name;
    private ArrayList<Value> value = new ArrayList<>();
    private ArrayList<Date> date = new ArrayList<>();

    public int getId() {
        return id;
    }

    public Currency (String name) {
        id = ++counter;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addValue(String val) {
        if (value.size() !=0) {
            throw new IllegalArgumentException("Value already exists");
        }
        Value v = new Value(val);

        value.add(v);
    }
    public ArrayList<Value> getValue() {
        return value;
    }
    public ArrayList<Date> getDate() {
        return date;
    }

    public void removeValue(String val) {
        for (Value value1 : value) {
            if (value1.getValue().equals(val)) {
                value.remove(value1);
                return;
            }
        }
        throw new IllegalArgumentException("wrong value");
    }
    public void addDate(String d) {
        Date date1 = new Date(d);
        if (date.size() !=0) {
            throw new IllegalArgumentException("Date already exists");
        }
        else {
            date.add(date1);
        }
    }

    public void removeDate(Date d) {
        for (Date date1 : date) {
            if (date1.getDate().equals(d.getDate())) {
                date.remove(date1);
                return;
            }
        }
        throw new IllegalArgumentException("invalid date");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency that = (Currency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
