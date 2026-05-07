package Technique8_UtilityClass;

class Item {

    private double price;
    private int quantity;

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Order {

    private java.util.List<Item> items;

    public java.util.List<Item> getItems() {
        return items;
    }
}

class OrderProcessor {

    public double calculateTotal(Order order) {

        double total = 0;

        for (Item item : order.getItems()) {

            total += item.getPrice()
                    * item.getQuantity();
        }

        return total;
    }
}

class InvoiceGenerator {

    public double calculateTotal(Order order) {

        double total = 0;

        for (Item item : order.getItems()) {

            total += item.getPrice()
                    * item.getQuantity();
        }

        return total;
    }
}

public class Before {
}