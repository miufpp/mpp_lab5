package lab5.prob4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CustOrderFactory custOrderFactory = new PremiumCustomerFactory(CustomerType.PREMIUM);
        custOrderFactory.createCustomer("John");


       Customer cust =  custOrderFactory.createCustomer("John");
        Order order = custOrderFactory.createOrder(cust, LocalDate.now());

        order.addItem(custOrderFactory.createItem("Shirt"));
        order.addItem(custOrderFactory.createItem("Laptop"));

        order = custOrderFactory.createOrder(cust, LocalDate.now());
        order.addItem(custOrderFactory.createItem("Pants"));
        order.addItem(custOrderFactory.createItem("Knife set"));


       
        System.out.println(cust.getOrders());
    }
}


