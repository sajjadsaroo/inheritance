package payment;

public class CreditCardPayment implements PaymentStrategy {
    public String cardNumber;
    public String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public void pay(double amount) {
        System.out.println(amount + " paid ! Details are shown here :");
        String data = getPaymentDetails();
        String[] split = data.split(",");
        System.out.println("Type of payment : " + split[0]);
        System.out.println("Card Number: : " + split[1]);
        System.out.println("Card holder Name: " + split[2]);
    }

    public String getPaymentDetails() {
        return "CreditCard," + cardNumber + "," + cardHolderName;
    }
}
