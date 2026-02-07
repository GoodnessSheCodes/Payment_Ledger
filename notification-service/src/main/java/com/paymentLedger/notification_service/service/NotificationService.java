package paymentLedger.notification_service.service;


public interface NotificationService {

    Notification sendNotification(Notification notification);
    List<Notification> getNotificationsByUserId(Long userId);

}
