package payment;

import java.util.ArrayList;

public abstract class Customer {
    public String name;
    public ArrayList<String> paymentHistory;
    public Customer(String name) {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }
    public abstract void displayCustomerInfo();
    public void makePayment(PaymentStrategy paymentStrategy , double amount) {
        paymentStrategy.pay(amount);
        String data = paymentStrategy.getPaymentDetails();
        String[] split = data.split(",");
        paymentHistory.add("amount:"+ amount + " type:" + split[0]);
    }

    public void showPaymentHistory() {
        System.out.println("Showing payment history for " + name);
        for (String s : paymentHistory) {
            System.out.println(s);
        }
        System.out.println();
    }
}
