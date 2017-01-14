/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.fpt.P00023.bo;

import vn.edu.fpt.P00023.entity.Fruit;
import vn.edu.fpt.P00023.entity.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crazyboy
 */
public class BusinessObject {

    public void menu(List<Fruit> dbFruit, List<Order> dbOrder) {
        Validate v = new Validate();
        int choice;
        System.out.println("1. Add Fruit");
        System.out.println("2. View order");
        System.out.println("3. Shopping");
        System.out.println("4. Exit");
        choice = v.validInt("enter your choice: ", 0, 4);
        switch (choice) {
            case 1:
                do {
                    dbFruit = addNewFruit(dbFruit);
                } while (v.isContinue("Do you want to continue? (Y/N): "));
                break;
            case 2:
                viewOrder(dbOrder);
                break;
            case 3:
                dbOrder = addNewOrder(dbOrder, dbFruit);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }

    public void viewOrder(List<Order> dbOrder) {
        if (!dbOrder.isEmpty()) {
            for (Order o : dbOrder) {
                System.out.println("Customer Name: " + o.getCusName());
                System.out.println("Product | Quantity | Price | Amount");
                for (Fruit f : o.getOrderItem()) {
                    System.out.println(f.toStringOrder());
                }
            }
        } else {
            System.out.println("Empty Order!!!");
        }
    }

    public List<Order> addNewOrder(List<Order> dbOrder, List<Fruit> dbFruit) {
        Validate v = new Validate();
        Fruit f = new Fruit();
        List<Fruit> orderItem = new ArrayList<>();
        int orderID;
        String cusName;
        int fruitId;
        int quantity;
        if (!dbFruit.isEmpty()) {
            viewStore(dbFruit);
            do {
                fruitId = v.validInt("Enter ID: ", 0, dbFruit.size());
                System.out.println("You selected: " + dbFruit.get(fruitId - 1).getName());
                if (f.getExistID(dbFruit.get(fruitId - 1).getName(), orderItem) == -1) {
                    quantity = v.validInt("Please input quantity: ", 0, dbFruit.get(fruitId - 1).getQuantity());
                    orderItem.add(new Fruit(orderItem.size() + 1, dbFruit.get(fruitId - 1).getName(), dbFruit.get(fruitId - 1).getOrigin(), dbFruit.get(fruitId - 1).getPrice(), quantity));
                } else {
                    System.out.println(dbFruit.get(fruitId - 1).getName() + " is exist in your cart!");
                    if (v.isContinue("Do you want to edit this item? (Y/N): ")) {
                        quantity = v.validInt("Please input quantity: ", 0, dbFruit.get(fruitId - 1).getQuantity());
                        orderItem.set(f.getExistID(dbFruit.get(fruitId - 1).getName(), orderItem),
                                new Fruit(f.getExistID(dbFruit.get(fruitId - 1).getName(), orderItem) + 1, dbFruit.get(fruitId - 1).getName(), dbFruit.get(fruitId - 1).getOrigin(), dbFruit.get(fruitId - 1).getPrice(), quantity));
                    }
                }
            } while (!v.isContinue("Do you want order now? (Y/N): "));
            cusName = v.validString("Enter your name: ");
            orderID = dbOrder.size() + 1;
            dbOrder.add(new Order(orderID, cusName, orderItem));
        } else {
            System.out.println("Empty Store!!!");
        }
        return dbOrder;
    }

    public List<Fruit> addNewFruit(List<Fruit> dbFruit) {
        Validate v = new Validate();
        Fruit f = new Fruit();
        String name;
        String origin;
        double price;
        int quantity;
        int id;
        name = v.validString("Enter Fruit name: ");
        origin = v.validString("Enter Fruit origin: ");
        price = v.validDouble("Enter price: ", 0, Double.MAX_VALUE);
        quantity = v.validInt("Enter quantity: ", 0, Integer.MAX_VALUE);
        id = f.getExistID(name, dbFruit);
        if (id != -1) {
            dbFruit.set(id - 1, new Fruit(id, name, origin, price, quantity));
        } else {
            dbFruit.add(new Fruit(dbFruit.size() + 1, name, origin, price, quantity));
        }
        return dbFruit;
    }

    public void viewStore(List<Fruit> dbFruit) {
        for (Fruit f : dbFruit) {
            System.out.println(f.toStringShopping());
        }
    }
}
