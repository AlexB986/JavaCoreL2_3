package transport;

public abstract class Transport <T extends  Driver> implements Competing {

    private String brend;
    private String model;
    private double engineValue;
    private T driver;
    public Transport(String brend,String model,double engineValue,T driver){
        this.brend = brend;
        this.model = model;
        this.engineValue = engineValue;
        setDriver(driver);
    }
    public String getBrend() {
        return this.brend;
    }

    public void setBrend(String brend) {
        if (brend == null || brend.isEmpty()) {
            brend = "default";
        }
        this.brend = brend;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
    }

    public double getEngineValue() {
        return this.engineValue;
    }

    public void setEngineValue(double engineValue) {
        if (engineValue <= 0) {
            engineValue = 1.5;
        }
        this.engineValue = engineValue;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void start();

    public abstract void stop();
    public abstract void getType();
    public abstract void  printType();
    public abstract void passDiagnostics () throws TransportTypeException;

    @Override
    public String toString() {
        return "Transport{" +
                "brend ='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue +
                '}';
    }
}
