package Technique9_Composition;

class OrderCalculator {

    public double calculateTotal(
            double subtotal,
            double taxRate
    ) {

        double tax = subtotal * taxRate;

        return subtotal + tax;
    }

    public double applyDiscount(
            double total,
            double discountRate
    ) {

        return total * (1 - discountRate);
    }
}

class DiscountCalculator {

    public double calculateTotal(
            double subtotal,
            double taxRate
    ) {

        double tax = subtotal * taxRate;

        return subtotal + tax;
    }

    public double applyDiscount(
            double total,
            double discountRate
    ) {

        return total * (1 - discountRate);
    }
}

public class Before {
}