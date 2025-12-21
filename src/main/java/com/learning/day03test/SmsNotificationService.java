package src.main.java.com.learning.day03test;

public class SmsNotificationService implements NotificationService{
    public void send(String message){
        System.out.println("Sending SMS: " + message);
    }
}
