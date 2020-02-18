package p5;
import p1.*;
import p4.*;

public class Agriculturaldrone extends UAV {

    //given attributes
    private int capacity; // carrying capacity of the drone

    //constructors
    //default constructor
    public Agriculturaldrone(){
        super();
        capacity=3;
    }

    //parameter constructor
    public Agriculturaldrone(double cost,double load,int cap){
        super(cost,load);
        capacity=cap;
    }
    //copy constructor
    public Agriculturaldrone(Agriculturaldrone copy){
        price=copy.getPrice();
        weight=copy.getWeight();
        capacity=copy.getCapacity();
    }

    //accessor
    public int getCapacity() {
        return capacity;
    }

    //mutator
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //methods
    //to string method
    public String toString() {
        return "This Agricultural Drone weighs " + weight +
                ", and costs " + price +
                "$. It has a carry capacity of "+capacity;
    }

    //equals
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||(getClass()!=o.getClass())) return false;
        Agriculturaldrone drone= (Agriculturaldrone) o;

        return Double.compare(drone.weight, weight) == 0 &&
                Double.compare(drone.price, price) == 0 &&
                drone.capacity==capacity;
    }
}
