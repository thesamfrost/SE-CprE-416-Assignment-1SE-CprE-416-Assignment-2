public class NotificationFactory {
    public static Notification createNotification(NotificationChannelType channelType) {
        switch (channelType) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SMSNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid notification channel type");
        }
    }
}
