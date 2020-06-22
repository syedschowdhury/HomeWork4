package nestedPackage;

public class PaymentServices {


    public PaymentServices(){}

    PayWithCreditCard creditCard = new PayWithCreditCard();
    PayWithDebitCard debitCard = new PayWithDebitCard();
    PayWithPaypal payPal = new PayWithPaypal();

    public void processPayment(String paymentInfo){

        if(paymentInfo.equalsIgnoreCase("CreditCard")){
            creditCard.processCreditCardPayment(paymentInfo);
        }else if(paymentInfo.equalsIgnoreCase("DebitCard")){
            debitCard.processDebitCardPayment(paymentInfo);
        }else if(paymentInfo.equalsIgnoreCase("payPal")){
            payPal.processPaypal(paymentInfo);
        }
    }

    //another class
    private class PayWithCreditCard{

        public void processCreditCardPayment(String creditCardInfo){
            System.out.println("Accepeted credit card payment and processed "+creditCardInfo);
        }
    }
    //another class
    private class PayWithDebitCard{

        public void processDebitCardPayment(String debitCardInfo){
            System.out.println("Accepeted debit card payment and processed "+debitCardInfo);
        }
    }
    //another class
    private class PayWithPaypal{

        public void processPaypal(String payPalnfo){
            System.out.println("Accepeted paypal payment and processed "+payPalnfo);
        }
    }




}
