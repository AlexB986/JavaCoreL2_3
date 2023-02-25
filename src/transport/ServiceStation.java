package transport;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    public static Queue queue = new LinkedList<>();
    private List<Transport> allTransport;
    private T transport;


    public ServiceStation(List<Transport> allTransport) {
        this.allTransport = allTransport;
        this.transport = transport;
    }

    public ServiceStation() {
        this.transport = transport;

    }

    public Queue<Transport> printAddCarToQueue(T transport) {
        queue.add(transport);
        return null;
    }

    public void carryOutVehicleInspection() {
        System.out.println("авто удалено из очереди");
        System.out.println(queue.poll());

        }
    }

