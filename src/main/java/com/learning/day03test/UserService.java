package src.main.java.com.learning.day03test;

public class UserService {
    private final NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    void notifyUser(String message){
        notificationService.send(message);
    }
}
