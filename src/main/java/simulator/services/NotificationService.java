package simulator.services;

import simulator.models.AlarmEvent;

public class NotificationService {

    public void send(AlarmEvent event) {

        System.out.println(

                "[Notification] " +

                event.getType() +

                " detected at " +

                event.getTime()

        );

    }

}
