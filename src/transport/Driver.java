package transport;


import java.util.Objects;

public class Driver {
    private String fullName;
    private boolean drivingLicense;
    private int experience;

    public Driver(String fullName, boolean drivingLicense, int experience) {
        this.fullName = fullName;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            fullName = "default";
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }



    public boolean getDrivingLicense() {
        return this.drivingLicense;
    }

    public void setExperience(int experience) {
        if (experience < 2) {
            experience = 0;
        }
        this.experience = experience;
    }

    public int getExperience() {
        return this.experience;
    }

    public void start() {
        System.out.println("Начал движение");
    }


    public void stop() {
        System.out.println("Остановл");
    }


    public void refuel() {
        System.out.println("Заправляюсь");
    }
    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingLicense == driver.drivingLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, drivingLicense, experience);
    }
}
