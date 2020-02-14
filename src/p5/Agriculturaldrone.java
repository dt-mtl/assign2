package p5;
import p1.*;
import p4.*;

public class Agriculturaldrone extends UAV {

    //given attributes
    protected int capacity; // carrying capacity of the drone

    //constructors
    //default constructor
    public Agriculturaldrone(){
        super();
        capacity=3;
    }

    //parameter constructor
    public Agriculturaldrone(String mark,double cost, int hp,double load,int cap){
        super(mark,cost,hp,load);
        capacity=cap;
    }
    //copy constructor
    public Agriculturaldrone(Agriculturaldrone copy){
        brand=copy.getBrand();
        price=copy.getPrice();
        horsepower=copy.getHorsepower();
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
        return "This Agricultural Drone is manufactured by " +brand+
                ". It weights " + weight +
                ", and costs " + price +
                "$. it can produce up to "+ horsepower+" Horsepower"+
                "/nit has a carry capacity of "+capacity;
    }

    //equals
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Agriculturaldrone))return false;
        if(o==null||(getClass()!=o.getClass())) return false; //FIXME gotta double check this null pattern as it always returns false!
        Agriculturaldrone drone= (Agriculturaldrone) o;

        return Double.compare(drone.weight, weight) == 0 &&
                Double.compare(drone.price, price) == 0 &&
                drone.capacity==capacity&&
                drone.horsepower==horsepower&&
                brand.equals(drone.brand);

    }
}
