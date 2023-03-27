package notification;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepo notificationRepo;

    public void send(NotificationRequest notificationRequest) {

        notificationRepo.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerName())
                        .sender("gggggggg ")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()

        );
    }
}
