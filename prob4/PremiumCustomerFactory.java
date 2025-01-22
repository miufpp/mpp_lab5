package lab5.prob4;

public class PremiumCustomerFactory extends CustOrderFactory{
    public PremiumCustomerFactory(CustomerType customerType) {
        super(customerType);
    }

    @Override
    public Customer createCustomer(String customerName) {
        return new PremiumCustomer(customerName);
    }
}
