package p4;
import p1.*;

import java.util.Objects;

public class UAV implements FlyingObject {


    public double getCost(Object p){
        UAV temp= (UAV) p;
         return temp.getPrice();
    }
    double cheap;
    public double cheapest(Object p,int count) {
        UAV temp= (UAV)p;
        if(count==0){
            cheap=temp.getPrice();
        }
        if(count != 0 && cheap > temp.getPrice()){
            cheap= temp.getPrice();
        }
        return cheap; //TODO careful when count is located at 0 in an the array
    }



    //given attributes
    protected double weight;
    protected double price;

    //constructors

    //default constructor
    public UAV(){
        price=500.55;
        weight=5.00;
    }

    //parameter constructor
    public UAV(double cost,double load){
        price=cost;
        weight=load;
    }
    //copy constructor
    public UAV(UAV copy){
        this.price=copy.getPrice();
        this.weight=copy.getWeight();
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
                Double.compare(uav.price, price) ==0;
    }


    //to string method
    public String toString() {
        return "This Unmanned Aerial Vehicle weighs " + weight +
                ", and costs " + price + "$. " ;
    }
}
