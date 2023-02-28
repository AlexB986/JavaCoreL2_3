package transport;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    public static Queue queue = new LinkedList<>();
    private List<Transport> allTransport;
    private Transport transport;


    public ServiceStation(List<Transport> allTransport) {
        this.allTransport = allTransport;
        this.transport = transport;
    }

    public ServiceStation() {
        this.transport = transport;

    }

    public void printAddCarToQueue(Transport transport) {
          queue.add(transport);
    }

    public void carryOutVehicleInspection() {
        System.out.println("авто удалено из очереди");
        System.out.println(queue.poll());

        }
    }

