package p3;
import p1.*;
import p2.*;

public class Multirotor extends Helicopter {

    //given attributes
    protected int rotors; //number of rotors

    //constructors

    //default constructor
    public Multirotor(){
        super();
        rotors=6;
    }
    //parameter constructor
    public Multirotor(String mark,double cost, int hp, int cyl, int create, int cap,int blades){
        super(mark,cost ,hp,cyl,create,cap);
        rotors=blades;
    }
    //copy constructor
    public Multirotor(Multirotor copy){
        brand=copy.getBrand();
        price=copy.getPrice();
        horsepower=copy.getHorsepower();
        cylinders=copy.getCylinders();
        createYear=copy.getCreateYear();
        capacity=copy.getCapacity();
        rotors=copy.getRotors();
    }

    //accessors
    public int getRotors() {
        return rotors;
    }

    //mutator
    public void setRotors(int rotors) {
        this.rotors = rotors;
    }

    //methods
    public String toString() {
        return "This Multirotor is made by" +
                " '" + brand + '\'' +
                ", it costs $" + price +
                " , it is capable of producing " + horsepower +
                " horsepower.\nIt has " + cylinders+
                " cylinders, and was created in the year "+ createYear+
                " , it can carry up to "+capacity+
                " passengers, and has "+ rotors+" rotors";
    }

    //equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null||(getClass()!=o.getClass())) return false;
        Multirotor that = (Multirotor) o;

        return brand.equals(that.brand)&&
                price == that.price&&
                horsepower==that.horsepower&&
                cylinders == that.cylinders &&
                createYear == that.createYear &&
                capacity == that.capacity&&
                rotors==that.rotors;
    }

}
