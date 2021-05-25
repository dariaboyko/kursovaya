package com.example.kursovaya;

import java.util.HashSet;
import java.util.Set;

public class Data {
    private static Data instance;
    private static final Set<Currency> currencies = new HashSet<>();
    private static final Set<Currency> foundCurrencies = new HashSet<>();


    public Data() {
    }


    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    public boolean hasCurrency(String name) {
        for (Currency c : currencies) {
            if (c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean hasDate(String name) {
        for (Currency c : currencies) {
            if (c.getDate().get(0).getDate().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public Currency findCurrency(String name) {
        for (Currency c : currencies) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
    public void addFoundCurrency(String name) {
        Currency foundCurrency = findCurrency(name);
        foundCurrencies.add(foundCurrency);
    }
    public static void deleteFoundCurrencies(){
        foundCurrencies.removeAll(foundCurrencies);

    }
    public Date findDate(String name) {
        for (Currency cur : currencies) {
            if (cur.getDate().get(0).getDate().equals(name) ) {
                return cur.getDate().get(0);
            }
        }
        return null;
    }
    public void anotherFindCurrency(String name) {
        Date d = findDate(name);
        for (Currency c : currencies) {
            if (c.getDate().get(0) == d) {
                foundCurrencies.add(c);
            }
        }


    }

    public void addCurrency(Currency currencyToAdd) {
        for (Currency value : currencies) {
            if (value.getName().equals(currencyToAdd.getName())) {
                return;
            }
        }
        currencies.add(currencyToAdd);
    }
    public void addValue(int id, Value value) {
        for (Currency cur : currencies) {
            if ((cur.getId() == id) ) {
                cur.addValue(value.getValue());
                return;
            }
        }
    }
    public void removeCurrency(Currency c) {
        currencies.remove(c);

    }

    public Currency getCurrencyById(int id) {
        for (Currency c : currencies) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public static Set<Currency> getCurrencies() {
        return currencies;
    }
    public static Set<Currency> getFoundCurrencies() {
        return foundCurrencies;
    }


    public void addDate(int cId,  Date date ){
        for (Currency cur : currencies) {
            if ((cur.getId() == cId) ) {
                cur.addDate(date.getDate());
                return;
            }
        }
    }
    public Value getValueById(int Id, int valueId) {
        for (Currency c : currencies) {
            if (c.getId() == Id) {
                for (Value v : c.getValue()) {
                    if (v.getId() == valueId) {
                        return v;
                    }
                }
            }
        }
        return null;
    }
    public Date getDateById(int Id, int dId) {
        for (Currency c : currencies) {
            if (c.getId() == Id) {
                for (Date d : c.getDate()) {
                    if (d.getId() == dId) {
                        return d;
                    }
                }
            }
        }
        return null;
    }
    public void removeValue(Currency currency, Value value) {
        currency.removeValue(value.getValue());
    }

    public void removeDate(Currency currency,  Date d) {
        currency.removeDate(d);
    }

}
