package Technique5_Strategy;

interface PaymentStrategy {

    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Processing credit card payment of $" + amount
        );
    }
}

class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Processing PayPal payment of $" + amount
        );
    }
}

class BitcoinPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Processing Bitcoin payment of $" + amount
        );
    }
}

class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(
            PaymentStrategy paymentStrategy
    ) {

        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {

        paymentStrategy.pay(amount);
    }
}

public class After {

    public static void main(String[] args) {

        PaymentProcessor processor =
                new PaymentProcessor();

        processor.setPaymentStrategy(
                new CreditCardPayment()
        );

        processor.processPayment(100.0);

        processor.setPaymentStrategy(
                new PayPalPayment()
        );

        processor.processPayment(50.0);

        processor.setPaymentStrategy(
                new BitcoinPayment()
        );

        processor.processPayment(200.0);
    }
}