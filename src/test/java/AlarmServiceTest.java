import org.junit.jupiter.api.Test;

import simulator.services.AlarmService;
import simulator.models.EventType;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AlarmServiceTest {

    @Test
    void handleDoorEvent() {

        AlarmService service =

                new AlarmService();

        assertDoesNotThrow(() ->

                service.handleEvent(

                        EventType.DOOR_OPEN

                )

        );

    }

    @Test
    void handleFireEvent() {

        AlarmService service =

                new AlarmService();

        assertDoesNotThrow(() ->

                service.handleEvent(

                        EventType.FIRE

                )

        );

    }

}
