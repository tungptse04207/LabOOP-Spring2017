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
public class Order {

    private int orderId;
    private String cusName;
    private List<Fruit> orderItem;

    public Order(int orderId, String cusName, List<Fruit> orderItem) {
        this.orderId = orderId;
        this.cusName = cusName;
        this.orderItem = orderItem;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCusName() {
        return cusName;
    }

    public List<Fruit> getOrderItem() {
        return orderItem;
    }
}
