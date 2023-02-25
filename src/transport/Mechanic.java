package transport;

import java.util.List;

public class Mechanic {
    private String name;
    private String company;


    public Mechanic(String name,String company){
        this.name=name;
        this.company=company;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCompany(){
        return this.company;
    }
    public void setCompany(String company){
        this.company=company;
    }

    public String maintenance(){
        return "проходит техобслуживаник";
    }
    public String fixCar(){
        return "проходит ремонт";
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

}

