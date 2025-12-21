package src.main.java.com.learning.day03test;

public class EmailNotificationService implements NotificationService{
    public void send(String message){
        System.out.println("Sending Email: " + message);
    }
}
