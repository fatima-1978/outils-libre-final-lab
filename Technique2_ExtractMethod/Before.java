package Technique2_ExtractMethod;

import java.util.List;

class Order {
    private Customer customer;
    private List<Item> items;

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }
}

class Customer {
    private String name;
    private boolean isMember;

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return isMember;
    }
}

class Item {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Before {

    public void printOrderSummary(Order order) {

        double totalPrice = 0;

        for (Item item : order.getItems()) {
            totalPrice += item.getPrice() * item.getQuantity();
        }

        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9;
        }

        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());

        for (Item item : order.getItems()) {
            System.out.println(item.getName());
        }

        System.out.println(totalPrice);
    }
}