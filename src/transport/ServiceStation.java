package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public static Queue<Transport> queue = new LinkedList<>();
    private Transport transport;

    public ServiceStation() {
        this.transport = transport;

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
        System.out.println(""+queue.poll());
    }
}

