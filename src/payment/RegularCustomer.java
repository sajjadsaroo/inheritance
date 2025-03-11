package payment;

import java.util.ArrayList;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name) {
        super(name);
    }
    public void displayCustomerInfo(){
        System.out.println("Customer Name : " + name);
        System.out.println("Customer type : Regular\n");
    }
}
