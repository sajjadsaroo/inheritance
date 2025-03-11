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
        ali_Paypal.pay(12000);
        CreditCardPayment ali_Credit = new CreditCardPayment("6219-8619" , "Ali Alizade Shemrooni");
        ali_Credit.pay(20000);

        PayPalPayment reza_Paypal = new PayPalPayment("Reza@gmail.com");
        reza_Paypal.pay(50000);
        CreditCardPayment reza_Credit = new CreditCardPayment("6210-8010" , "Reza Rezazade");
        reza_Credit.pay(25000);

        BitcoinPayment mahmood_Bitcoin = new BitcoinPayment("1234569");
        mahmood_Bitcoin.pay(50000);
        PayPalPayment mahmood_Credit = new PayPalPayment("mahmood@gmail.com");
        mahmood_Credit.pay(30000);

        

    }
}