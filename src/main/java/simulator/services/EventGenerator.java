package simulator.services;

import simulator.models.AlarmEvent;
import simulator.models.EventType;

import java.util.Random;

public class EventGenerator {

    private final Random random =
            new Random();

    public AlarmEvent randomEvent() {

        EventType[] values =
                EventType.values();

        EventType type =

                values[random.nextInt(values.length)];

        return new AlarmEvent(type);

    }

}
