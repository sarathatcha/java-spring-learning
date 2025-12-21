package src.main.java.com.learning.day03test2;

public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    void payment(int amount){
        paymentProcessor.pay(amount);
    }
}
