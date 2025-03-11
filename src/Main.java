import payment.*;


public class Main {
    public static void main(String[] args) {
        PremiumCustomer ali = new PremiumCustomer("Ali Alizade");
        PremiumCustomer reza = new PremiumCustomer("Reza Rezazade");
        RegularCustomer mahmood = new RegularCustomer("Mahmood Mahmoodi");

        ali.displayCustomerInfo();
        reza.displayCustomerInfo();
        mahmood.displayCustomerInfo();

        PayPalPayment ali_Paypal = new PayPalPayment("Ali@gmail.com");
        ali.makePayment(ali_Paypal,12000);
        CreditCardPayment ali_Credit = new CreditCardPayment("6219-8619" , "Ali Alizade Shemrooni");
        ali.makePayment(ali_Credit,20000);


        PayPalPayment reza_Paypal = new PayPalPayment("Reza@gmail.com");
        reza.makePayment(reza_Paypal,50000);
        CreditCardPayment reza_Credit = new CreditCardPayment("6210-8010" , "Reza Rezazade");
        reza.makePayment(reza_Credit,25000);

        BitcoinPayment mahmood_Bitcoin = new BitcoinPayment("1234569");
        mahmood.makePayment(mahmood_Bitcoin,50000);
        PayPalPayment mahmood_Credit = new PayPalPayment("mahmood@gmail.com");
        mahmood.makePayment(mahmood_Credit,30000);


        ali.showPaymentHistory();
        reza.showPaymentHistory();
        mahmood.showPaymentHistory();

    }
}