package lab5.prob4;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private final String name;

    private final List<Order> orders;

    protected Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public Customer() {
        name = "Jones";
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }


}
