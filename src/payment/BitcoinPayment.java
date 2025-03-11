package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(double amount) {
        System.out.println(amount + " paid ! Details are shown here :");
        String data = getPaymentDetails();
        String[] split = data.split(",");
        System.out.println("Type of payment : " + split[0]);
        System.out.println("Wallet Address:  " + split[1]);
        System.out.println();
        System.out.println();
    }

    public String getPaymentDetails() {
        return "Bitcoin," + walletAddress;
    }


}
