package lab5.prob4;

public class RegularCustomerFactory extends CustOrderFactory{


    public RegularCustomerFactory(CustomerType customerType) {
        super(customerType);
    }

    @Override
    public Customer createCustomer(String customerName) {
        return new RegularCustomer(customerName);
    }
}
