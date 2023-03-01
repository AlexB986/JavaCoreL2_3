public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    //        for (Transport element : allTransport)
//            if (element.getClass()!= Buses.class) {
//                serviceStation.printAddCarToQueue(element);
//            }
//        System.out.println("добавлены авто в очередь");
//        System.out.println(ServiceStation.queue);
//        serviceStation.carryOutVehicleInspection();
//
//
//        for (Transport element : allTransport)
//            try {
//                element.passDiagnostics();
//                serviceStation.printAddCarToQueue(element);
//            } catch (TransportTypeException e) {
//            }
//        System.out.println(ServiceStation.queue);
//    }
}
//////////////////////////////////////////////////////////////
//        for (Transport element : allTransport)
//            if (element.getClass() != Buses.class) {
//                try {
//                    element.passDiagnostics();
//                    serviceStation.AddCarToQueue(element);
//                } catch (TransportTypeException e) {
//                }
//                serviceStation.AddCarToQueue(element);
//            }
//        System.out.println("добавлены авто в очередь");
//        System.out.println(ServiceStation.queue);
//        serviceStation.carryOutVehicleInspection();
//////////////////////////////////////////////////////////////////
//        Map<String, List<Transport>> carsMap = new HashMap<>();
//        for (Transport element : allTransport) {
//
//            carsMap.put(element.getBrend(), element.getMechanics());
//
//        }
//
//        for(Map.Entry m :carsMap.entrySet())
//        System.out.println("Автомобиль " + m.getKey() + " Механики " + m.getValue());