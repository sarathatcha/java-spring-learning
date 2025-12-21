package src.main.java.com.learning.day03test2;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    public void pay(int amount){
        System.out.println("Credit card payment done of amount: " + amount);
    }
}
