package simulator.utils;

import simulator.models.AlarmEvent;

public class ConsolePrinter {

    public void print(AlarmEvent event) {

        System.out.println(

                "----------------------------"

        );

        System.out.println(

                "Event : " +

                event.getType()

        );

        System.out.println(

                "Time  : " +

                event.getTime()

        );

        System.out.println(

                "----------------------------"

        );

    }

}
