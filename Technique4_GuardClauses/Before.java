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

public class Before {

    public double calculateDiscount(Order order) {

        double discount = 0.0;

        if (order.getTotalAmount() > 100) {

            if (order.getCustomer().isPremium()) {
                discount = 0.2;

            } else {
                discount = 0.1;
            }
        }

        return discount;
    }
}