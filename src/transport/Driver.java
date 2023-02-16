package transport;


public class Driver{
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
}
