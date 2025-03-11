package payment;

import java.util.ArrayList;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String name) {
        super(name);
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name : " + name);
        System.out.println("Customer type : Premium\n");
    }

}
