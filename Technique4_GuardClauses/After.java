package Technique4_GuardClauses;

class Customer {

    private boolean premium;

    public boolean isPremium() {
        return premium;
    }
}

class Order {

    private double totalAmount;
    private Customer customer;

    public double getTotalAmount() {
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }
}

public class After {

    public double calculateDiscount(Order order) {

        if (order.getTotalAmount() <= 100) {
            return 0.0;
        }

        if (order.getCustomer().isPremium()) {
            return 0.2;
        }

        return 0.1;
    }
}