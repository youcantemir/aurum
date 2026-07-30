package simulator.services;

import simulator.models.AlarmEvent;

import java.util.ArrayList;
import java.util.List;

public class EventLogService {

    private final List<AlarmEvent> events =
            new ArrayList<>();

    public void save(AlarmEvent event) {

        events.add(event);

    }

    public List<AlarmEvent> getEvents() {

        return events;

    }

    public int count() {

        return events.size();

    }

}
