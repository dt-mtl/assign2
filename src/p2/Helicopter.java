package p2;
import p1.*;

import java.util.Objects;

public class Helicopter extends Airplane{

    //given additional to airplane attributes
    protected int cylinders; // number of cylinders
    protected int createYear; // year of creation
    protected int capacity; //capacity for passengers

    //constructors
    //Default constructor
    public Helicopter(){
        super();
        cylinders=6;
        createYear=2000;
        capacity=12;
    }

    //parameter constructor
    public Helicopter(String mark,double cost, int hp, int cyl, int create, int cap){
        super(mark,cost ,hp );
        cylinders=cyl;
        createYear=create;
        capacity=cap;
    }

    //copy constructor
    public Helicopter(Helicopter copy){
        brand=copy.getBrand();
        price=copy.getPrice();
        horsepower=copy.getHorsepower();
        cylinders=copy.getCylinders();
        createYear=copy.getCreateYear();
        capacity=copy.getCapacity();
    }

    //accessors


    public int getCapacity() {
        return capacity;
    }

    public int getCreateYear() {
        return createYear;
    }

    public int getCylinders() {
        return cylinders;
    }

    //mutator
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    //methods

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null||(getClass()!=o.getClass())) return false;
        Helicopter that = (Helicopter) o;
        return brand.equals(that.brand)&&
               price == that.price&&
               horsepower==that.horsepower&&
                cylinders == that.cylinders &&
                createYear == that.createYear &&
                capacity == that.capacity;
    }


    public String toString() {
        return "This Helicopter is made by" +
                " '" + brand + '\'' +
                ", it costs $" + price +
                " , it is capable of producing " + horsepower +
                " horsepower.\nIt has " + cylinders+
                " cylinders, and was created in the year "+ createYear+
                " , it can carry up to "+capacity+
                " passengers";
    }
}

