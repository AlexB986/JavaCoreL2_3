package transport;

import java.util.*;

public class CarBook {
    public static void main(String[] args) {
        Category_driverB driverCar1 = new Category_driverB("Толстов.И.Б", true, 7);
        Category_driverB driverCar2 = new Category_driverB("Прохоров.А.С", true, 18);
        Category_driverB driverCar3 = new Category_driverB("Окунев.С.Ю", true, 40);
        Category_driverB driverCar4 = new Category_driverB("Ветров.И.Е", true, 1);

        Category_driverC driverTracks1 = new Category_driverC("Бабков.А.М", true, 26);
        Category_driverC driverTracks2 = new Category_driverC("Толстов.И.Б", true, 14);
        Category_driverC driverTracks3 = new Category_driverC("Ткачев.Е.В", true, 30);
        Category_driverC driverTracks4 = new Category_driverC("Романов.С.Г", true, 12);

        Category_driverD driverBus1 = new Category_driverD("Шумахер.Т.Р", true, 21);
        Category_driverD driverBus2 = new Category_driverD("Костин.И.В", true, 25);
        Category_driverD driverBus3 = new Category_driverD("Рашидов.М.В", true, 15);
        Category_driverD driverBus4 = new Category_driverD("Бобров.Г.Ю", true, 10);


        Mechanic mechanic1 = new Mechanic("Петрович", "СТО1");
        Mechanic mechanic2 = new Mechanic("Иваныч", "СТО2");
        Mechanic mechanic3 = new Mechanic("Саныч", "СТО3");
        Mechanic mechanic4 = new Mechanic("Макарыч", "СТО4");
        Mechanic mechanic5 = new Mechanic("Кузмич", "СТО5");
        Mechanic mechanic6 = new Mechanic("Толян", "СТО6");

        List<Mechanic> allMechananicsCars = new ArrayList<>();
        allMechananicsCars.add(mechanic1);
        allMechananicsCars.add(mechanic2);
        List<Mechanic> allMechananicsBus = new ArrayList<>();
        allMechananicsBus.add(mechanic3);
        allMechananicsBus.add(mechanic4);
        List<Mechanic> allMechananicsTraks = new ArrayList<>();
        allMechananicsTraks.add(mechanic5);
        allMechananicsTraks.add(mechanic6);


        Cars car1 = new Cars("Lada", "B1", 2.5, driverCar1, CarBody.VAN, allMechananicsCars);
        Cars car2 = new Cars("Ford", "B2", 1.5, driverCar2, CarBody.COUPE, allMechananicsCars);
        Cars car3 = new Cars("VW", "B3", 2.0, driverCar3, CarBody.SEDAN, allMechananicsCars);
        Cars car4 = new Cars("ЗАЗ", "B4", 1.3, driverCar4, CarBody.UNIVERSAL, allMechananicsCars);

        Tracks track1 = new Tracks("Kamaz", "С1", 5.0, driverTracks1, LoadCapacity.N1, allMechananicsBus);
        Tracks track2 = new Tracks("Volvo", "С2", 4.5, driverTracks2, LoadCapacity.N2, allMechananicsBus);
        Tracks track3 = new Tracks("МАЗ", "С3", 7.1, driverTracks3, LoadCapacity.N3, allMechananicsBus);
        Tracks track4 = new Tracks("ЗИЛ", "С4", 6.2, driverTracks4, LoadCapacity.N2, allMechananicsBus);

        Buses bus1 = new Buses("Паз", "А1", 2.0, driverBus1, BusCapacity.busBig, allMechananicsTraks);
        Buses bus2 = new Buses("Газ", "А2", 3.1, driverBus2, BusCapacity.busAverage, allMechananicsTraks);
        Buses bus3 = new Buses("Raf", "А3", 1.9, driverBus3, BusCapacity.busSmall, allMechananicsTraks);
        Buses bus4 = new Buses("Fiat", "А4", 2.5, driverBus4, BusCapacity.busExtraLarge, allMechananicsTraks);


        List<Transport> allTransport = new ArrayList<>();
        allTransport.add(car1);
        allTransport.add(car2);
        allTransport.add(car3);
        allTransport.add(car4);
        allTransport.add(track1);
        allTransport.add(track2);
        allTransport.add(track3);
        allTransport.add(track4);
        allTransport.add(bus1);
        allTransport.add(bus2);
        allTransport.add(bus3);
        allTransport.add(bus4);

        car1.pit_stop();
        car2.bestLapTime();
        track2.maxSpeed();
        car2.pit_stop();
        allRacer(car1);
        allRacer(bus1);
        allRacer(track1);
        CarBody carBody = CarBody.MINIVAN;
        System.out.println(carBody.toString());
        LoadCapacity loadCapacity = LoadCapacity.N3;
        LoadCapacity loadCapacity1 = LoadCapacity.N1;
        System.out.println(loadCapacity.toString());
        System.out.println(loadCapacity1.toString());
        BusCapacity busCapacity = BusCapacity.busSmall;
        System.out.println(busCapacity.toString());
        BusCapacity busCapacity1 = BusCapacity.busExtraLarge;
        System.out.println(busCapacity1.toString());
        System.out.println(track1.getTrackType());
        track1.printType();
        track1.passDiagnostics();
        try {
            bus3.passDiagnostics();
        } catch (TransportTypeException e) {
            throw new RuntimeException(e);
        }
        System.out.println(car1.getBrend() + " " + allMechananicsCars.get(1).maintenance());
        System.out.println(track1.getBrend() + " " + allMechananicsBus.get(1).fixCar());
        System.out.println(car1.getMechanics());
        mechanikcTransport(car3);


        ServiceStation serviceStation = new ServiceStation();

        for (Transport element : allTransport) {
            serviceStation.AddCarToQueue(element);
        }
        System.out.println("добавлены авто в очередь");
        System.out.println(ServiceStation.queue);
        serviceStation.carryOutVehicleInspection();

        Map<String, List<Transport>> carsMap = new HashMap<>();
        for (Transport element : allTransport) {

            carsMap.put(element.getBrend(), element.getMechanics());

        }

        for (Map.Entry m : carsMap.entrySet())
            System.out.println("Автомобиль " + m.getKey() + " Механики " + m.getValue());


        Set<String> drivers = new HashSet<>();

        for (Transport element : allTransport) {
            drivers.add(element.getDriver().getFullName());
        }
        System.out.println(drivers);

        Iterator<String>iterDriver = drivers.iterator();
        while (iterDriver.hasNext()){
            System.out.println(iterDriver.next());
        }


    }

    public static void mechanikcTransport(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " Имя механика " + transport.getMechanics().get(1).getName() + " , " + transport.getMechanics().get(1).getName());
    }


    public static void allRacer(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrend() + " " + transport.getModel() + " и будет участвовать в заезде");
    }
}

