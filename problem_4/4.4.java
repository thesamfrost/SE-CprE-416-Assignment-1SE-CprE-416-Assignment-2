public class Main {
    public static void main(String[] args) {
        // Retrieve a notification instance using the factory
        Notification notification = NotificationFactory.createNotification(NotificationChannelType.EMAIL);
        // Send a message without needing to know the concrete class
        notification.send("Hello!");
    }
}
