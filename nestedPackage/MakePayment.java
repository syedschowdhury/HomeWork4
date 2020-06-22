package nestedPackage;

public class MakePayment {
    public static void main(String[] args) {

        PaymentServices Services = new PaymentServices();
        Services.processPayment("DebitCard");

        Services.processPayment("CreditCard");

        Services.processPayment("payPal");



    }
}
