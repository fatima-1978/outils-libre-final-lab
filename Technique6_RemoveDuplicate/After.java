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

public class After {

    public void processOrder(Order order) {

        validateOrder(order);

        System.out.println(
                "Processing order for customer: "
                        + order.getCustomer().getName()
        );

        validatePayment(order.getPayment());

        System.out.println(
                "Processing payment of $"
                        + order.getPayment().getAmount()
        );
    }

    public void processRefund(Order order) {

        validateOrder(order);

        System.out.println(
                "Processing refund for customer: "
                        + order.getCustomer().getName()
        );

        validatePayment(order.getPayment());

        System.out.println(
                "Refunding payment of $"
                        + order.getPayment().getAmount()
        );
    }

    private void validateOrder(Order order) {

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
    }

    private void validatePayment(Payment payment) {

        if (payment == null) {

            throw new IllegalArgumentException(
                    "Order must have a payment method"
            );
        }

        if (payment.getAmount() <= 0) {

            throw new IllegalArgumentException(
                    "Payment amount must be greater than 0"
            );
        }
    }
}