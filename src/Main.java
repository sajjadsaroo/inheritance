import payment.CreditCardPayment;
import payment.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PayPalPayment credit = new PayPalPayment("@");
        credit.pay(10000);
    }
}