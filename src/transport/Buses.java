package transport;


public class Buses extends Transport<Category_driverD> {
    public BusCapacity type;

    public Buses(String brend, String model, double engineValue, Category_driverD driver, BusCapacity type) {
        super(brend, model, engineValue, driver);
        this.type = type;
    }

    public BusCapacity getTrackType() {
        return this.type;
    }

    @Override
    public void pit_stop() {
        System.out.println(" PIT-STOP " + getBrend());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг " + getBrend());

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 150");

    }

    @Override
    public void start() {
        System.out.println("Начал движение " + getBrend());
    }

    @Override
    public void stop() {
        System.out.println("Остановилься " + getBrend());

    }

    @Override
    public void getType() {

    }
    @Override
    public void passDiagnostics() throws TransportTypeException {
        System.out.println("Автобусы диагностику проходить не должны");
    }

    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        type.toString();
    }

}

