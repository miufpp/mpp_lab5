package lab5.prob4;

import java.time.LocalDate;

public abstract class CustOrderFactory {


    private final CustomerType customerType;

    public CustOrderFactory(CustomerType customerType) {
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public static Order createOrder(Customer customer, LocalDate orderDate) {

        if (orderDate == null || customer == null)
            throw new NullPointerException("Order Date or customer can't be null");
        Order order = new Order(orderDate);
        customer.addOrder(order);
        return order;
    }

    public abstract Customer createCustomer(String customerName);

    public static Item createItem(String itemName) {
        if (itemName == null || itemName.isEmpty()) throw new NullPointerException("Item name cant be null or empty");
        return new Item(itemName);
    }
}
