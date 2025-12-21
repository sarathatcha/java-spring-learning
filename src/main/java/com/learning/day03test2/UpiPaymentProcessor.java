package src.main.java.com.learning.day03test2;

public class UpiPaymentProcessor implements PaymentProcessor{
    public void pay(int amount) {
        System.out.println("UPI payment done of amount: "+ amount);
    }
}
