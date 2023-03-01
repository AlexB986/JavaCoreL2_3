package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public static Queue<Transport> queue = new LinkedList<>();

    public ServiceStation() {

    }

    public void AddCarToQueue(Transport transport) {
        queue.add(transport);
    }


    public void carryOutVehicleInspection() {
        for (Transport element : queue) {
            if (element.getClass() != Buses.class) {
                try {
                    element.passDiagnostics();
                } catch (TransportTypeException e) {
                }

            }
        }
        System.out.println("Удаление из очереди "+queue.poll());
    }
}

