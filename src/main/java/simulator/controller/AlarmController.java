package simulator.controller;

import simulator.models.EventType;
import simulator.services.AlarmService;

public class AlarmController {

    private final AlarmService service =
            new AlarmService();

    public void simulateDoorOpen() {

        service.handleEvent(

                EventType.DOOR_OPEN

        );

    }

    public void simulateAlarm() {

        service.handleEvent(

                EventType.ALARM

        );

    }

    public void simulateFire() {

        service.handleEvent(

                EventType.FIRE

        );

    }

    public void simulatePowerLoss() {

        service.handleEvent(

                EventType.POWER_LOSS

        );

    }

}
