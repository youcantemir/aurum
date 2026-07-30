package simulator.models;

import java.time.LocalDateTime;

public class AlarmEvent {

    private EventType type;

    private LocalDateTime time;

    public AlarmEvent(EventType type) {

        this.type = type;

        this.time = LocalDateTime.now();

    }

    public EventType getType() {

        return type;

    }

    public LocalDateTime getTime() {

        return time;

    }

}
