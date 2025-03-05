package payment;

public class PayPalPayment implements PaymentStrategy{

    public String email;
    public PayPalPayment(String email) {
        this.email = email;
    }

    public String getPaymentDetails(){
        return "PayPal," + email;
    }

    public void pay(double amount){
        System.out.println(amount + " paid ! Details are shown here :");
        String data = getPaymentDetails();
        String[] split = data.split(",");
        System.out.println("Type of payment : " + split[0]);
        System.out.println("Email Address: : " + split[1]);
    }

}
