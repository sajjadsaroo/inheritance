import payment.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment credit = new CreditCardPayment("1234" , "ali");
        credit.pay(10000);
    }
}