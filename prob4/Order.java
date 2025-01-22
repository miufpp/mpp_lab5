package lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private final LocalDate orderDate;

    private final List<Item> orderItems;


    protected Order(LocalDate orderDate) {
        this.orderDate = orderDate;
        orderItems = new ArrayList<>();
    }


    public void addItem(Item item) {
        orderItems.add(item);
    }

    @Override
    public String toString() {
        return orderDate + ": " +
                orderItems.toString();
    }
}
