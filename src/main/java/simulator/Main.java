package simulator;

import simulator.controller.AlarmController;

public class Main {

    public static void main(String[] args) {

        AlarmController controller = new AlarmController();

        controller.simulateDoorOpen();

        controller.simulateFire();

        controller.simulatePowerLoss();

        controller.simulateAlarm();

    }

}
