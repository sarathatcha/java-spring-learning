package src.main.java.com.learning.day03test2;

public class Main {
    public static void main(String[] args){
        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        PaymentService paymentService = new PaymentService(creditCardPaymentProcessor);
        UpiPaymentProcessor upiPaymentProcessor = new UpiPaymentProcessor();
        PaymentService paymentService1 = new PaymentService(upiPaymentProcessor);

        paymentService.payment(1000);
        paymentService1.payment(2000);
    }
}
