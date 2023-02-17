package transport;


public class Category_driverD extends Driver{
    public Category_driverD(String fullName, boolean drivingLicense, int experience) {
        super(fullName, drivingLicense, experience);
    }
    @Override
    public void start() {
        System.out.println("Начал движение  водитель "+getFullName());
    }

    @Override
    public void stop() {
        System.out.println("Остановл водитель "+getFullName());
    }

    @Override
    public void refuel() {
        System.out.println("Заправляюсь "+getFullName());
    }
}
