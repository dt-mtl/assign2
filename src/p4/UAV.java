package p4;
import p1.*;

public class UAV extends Airplane {

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
        weight=copy.weight;
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


    public String toString() {
        return "This Unmanned Aerial Vehicle is manifactured by " +brand+
                ". It weights " + weight +
                ", and costs " + price +
                "$. it can carry";
    }
}
