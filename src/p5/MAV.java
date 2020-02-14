package p5;
import p4.*;

import java.util.Objects;

public class MAV extends UAV {

    //given attributes

    protected String model; // model of the MAV
    protected double size; // size of the MAV

    //constructors
    //default constructor
    public MAV(){
        super();
        model="DJI";
        size=15.25;
    }

    //parameter constructor
    public MAV(String mark,double cost, int hp,double load, String model,double size){
        super(mark,cost,hp,load);
        this.model=model;
        this.size=size;
    }
    //copy constructor
    public MAV(MAV copy){
        brand=copy.getBrand();
        price=copy.getPrice();
        horsepower=copy.getHorsepower();
        weight=copy.getWeight();
        model=copy.getModel();
        size=copy.getSize();
    }

    //accessor

    public double getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    //mutator

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(double size) {
        this.size = size;
    }
    //methods
    //to string method
    public String toString() {
        return "This MAV is manufactured by " +brand+
                ". It weights " + weight +
                ", and costs " + price +
                "$. it can produce up to "+ horsepower+" Horsepower"+
                "/nThe model of this MAV is "+model+
                " , it is "+size+" CM in size";
    }
    //equals

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MAV)) return false;
        if (!super.equals(o)) return false;
        MAV mav = (MAV) o;
        return Double.compare(mav.size, size) == 0 &&
                model.equals(mav.model)&&
                mav.horsepower==horsepower&&
                brand.equals(mav.brand)&&
                Double.compare(mav.price,price)==0&&
                Double.compare(mav.weight,weight)==0;
    }


}
