package Technique6_RemoveDuplicate;

class Payment {

    private double amount;

    public double getAmount() {
        return amount;
    }
}

class Customer {

    private String name;

    public String getName() {
        return name;
    }
}

class Order {

    private Customer customer;
    private Payment payment;

    public java.util.List<String> getItems() {
        return java.util.List.of("Item");
    }

    public Customer getCustomer() {
        return customer;
    }

    public Payment getPayment() {
        return payment;
    }
}

public class Before {

    public void processOrder(Order order) {

        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException(
                    "Order must have at least one item"
            );
        }

        if (order.getCustomer() == null) {
            throw new IllegalArgumentException(
                    "Order must have a customer"
            );
        }

        System.out.println(
                "Processing order for customer: "
                        + order.getCustomer().getName()
        );

        if (order.getPayment() == null) {
            throw new IllegalArgumentException(
                    "Order must have a payment method"
            );
        }

        if (order.getPayment().getAmount() <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be greater than 0"
            );
        }

        System.out.println(
                "Processing payment of $"
                        + order.getPayment().getAmount()
        );
    }

    public void processRefund(Order order) {

        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException(
                    "Order must have at least one item"
            );
        }

        if (order.getCustomer() == null) {
            throw new IllegalArgumentException(
                    "Order must have a customer"
            );
        }

        System.out.println(
                "Processing refund for customer: "
                        + order.getCustomer().getName()
        );

        if (order.getPayment() == null) {
            throw new IllegalArgumentException(
                    "Order must have a payment method"
            );
        }

        if (order.getPayment().getAmount() <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be greater than 0"
            );
        }

        System.out.println(
                "Refunding payment of $"
                        + order.getPayment().getAmount()
        );
    }
}