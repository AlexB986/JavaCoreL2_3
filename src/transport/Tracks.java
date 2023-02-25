package transport;

import java.util.List;

public class Tracks extends Transport<Category_driverC> {
    private LoadCapacity type;

    public Tracks(String brend, String model, double engineValue, Category_driverC driver, LoadCapacity type, List<Mechanic> mechanics) {
        super(brend, model, engineValue, driver, mechanics);
        this.type = type;
    }

    public LoadCapacity getTrackType() {
        return this.type;
    }

    @Override
    public void pit_stop() {
        System.out.println("PIT-STOP " + getBrend());

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг " + getBrend());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 255");
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
    public void passDiagnostics()  {
        System.out.println("Пройти грузовикам диагностику");

    }

    @Override
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        type.toString();
    }

}
