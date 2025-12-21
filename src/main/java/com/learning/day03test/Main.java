package src.main.java.com.learning.day03test;

public class Main {
    public static void main(String[] args){
        SmsNotificationService sms = new SmsNotificationService();
        UserService userService = new UserService(sms);

        userService.notifyUser("OTP sent");

        EmailNotificationService email = new EmailNotificationService();
        UserService userService1 = new UserService(email);

        userService1.notifyUser("Welcome via email");
    }
}
