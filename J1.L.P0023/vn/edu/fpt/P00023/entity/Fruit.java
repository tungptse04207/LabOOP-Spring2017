/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.fpt.P00023.entity;

import java.util.List;

/**
 *
 * @author crazyboy
 */
public class Fruit {

    private int id;
    private String name;
    private String origin;
    private double price;
    private int quantity;

    public Fruit() {
    }

    public Fruit(int id, String name, String origin, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExistID(String name, List<Fruit> dbFruit) {
        for (Fruit f : dbFruit) {
            if (f.getName().equals(name)) {
                return dbFruit.indexOf(f);
            }
        }
        return -1;
    }

    public String toStringShopping() {
        return id + " | " + name + " | " + origin + " | " + String.format("$%.2f", price);
    }

    public String toStringOrder() {
        return id + ". " + name + " | " + quantity + " | " + String.format("$%.2f", price) + " | " + String.format("$%.2f", quantity * price);
    }

}
