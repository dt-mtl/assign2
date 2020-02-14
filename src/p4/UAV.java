package p4;
import p1.*;

import java.util.Objects;

public class UAV extends Airplane {
//TODO does the UAV class Extend airplanes or is it a class of its own with just three extensions and no brand?
//in the assingment it indicates a brand for the UAV...
    //given attributes
    protected double weight;
    protected double price;

    //constructors

    //default constructor
    public UAV(){
        super();
        weight=5.00;
    }

    //parameter constructor
    public UAV(String mark,double cost, int hp,double load){
        super(mark,cost,hp);
        weight=load;
    }
    //copy constructor
    public UAV(UAV copy){
        brand=copy.getBrand();
        price=copy.getPrice();
        horsepower=copy.getHorsepower();
        weight=copy.getWeight();
    }

    //accessor
    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    //mutator

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //methods
//equals method

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UAV)) return false;
        if (o==null||(getClass()!=o.getClass())) return false; //FIXME gotta double check this null pattern
        UAV uav = (UAV) o;
        return Double.compare(uav.weight, weight) == 0 &&
                Double.compare(uav.price, price) == 0&&
                uav.horsepower==horsepower&&
                brand.equals(uav.brand);
    }


    //to string method
    public String toString() {
        return "This Unmanned Aerial Vehicle is manufactured by " +brand+
                ". It weights " + weight +
                ", and costs " + price +
                "$. it can produce up to "+ horsepower+" Horsepower" ;
    }
}
