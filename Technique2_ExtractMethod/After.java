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

public class After {

    public void printOrderSummary(Order order) {

        double totalPrice = calculateTotalPrice(order.getItems());

        totalPrice = applyDiscount(
                totalPrice,
                order.getCustomer().isMember()
        );

        printSummary(order, totalPrice);
    }

    private double calculateTotalPrice(List<Item> items) {

        double totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }

        return totalPrice;
    }

    private double applyDiscount(
            double totalPrice,
            boolean isMember
    ) {

        if (isMember) {
            return totalPrice * 0.9;
        }

        return totalPrice;
    }

    private void printSummary(
            Order order,
            double totalPrice
    ) {

        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());

        printItems(order.getItems());

        System.out.println(totalPrice);
    }

    private void printItems(List<Item> items) {

        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}