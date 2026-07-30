package simulator.services;

import simulator.models.AlarmEvent;
import simulator.models.EventType;

public class AlarmService {

    private final NotificationService notifications =
            new NotificationService();

    private final EventLogService logService =
            new EventLogService();

    public void handleEvent(EventType type) {

        AlarmEvent event =

                new AlarmEvent(type);

        logService.save(event);

        notifications.send(event);

    }

}
