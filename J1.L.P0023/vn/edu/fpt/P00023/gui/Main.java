/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.fpt.P00023.gui;

import vn.edu.fpt.P00023.entity.Fruit;
import vn.edu.fpt.P00023.entity.Order;
import java.util.ArrayList;
import java.util.List;
import vn.edu.vn.P00023.bo.BusinessObject;
import java.io.IOException;

/**
 *
 * @author crazyboy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BusinessObject p=new BusinessObject();
        List<Fruit> dbFruit=new ArrayList<>();
        List<Order> dbOrder = new ArrayList<>();
        while(true){
            p.menu(dbFruit,dbOrder);
        }
    }
}
