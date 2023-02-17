package transport;

public class Category_driverB  extends Driver{


    public Category_driverB(String fullName, boolean drivingLicense, int experience) {
        super(fullName, drivingLicense, experience);
    }
    @Override
    public void start() {
        System.out.println("Начал движение  водитель "+getFullName());
    }

    @Override
    public void stop() {
        System.out.println("Остановлся водитель "+getFullName());
    }

    @Override
    public void refuel() {
        System.out.println("Заправляюсь "+getFullName());
    }
}

