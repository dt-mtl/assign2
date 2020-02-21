package p1;

import p4.UAV;

import java.util.Objects;

public class Airplane implements FlyingObject {

    public double getCost(Object p){
        Airplane temp= (Airplane) p;
        return temp.getPrice();
    }
    double cheap;
    public double cheapest(Object p,int count) {
        Airplane temp= (Airplane)p;
        if(count==0){
            cheap=temp.getPrice();
        }
        if(count != 0 && cheap > temp.getPrice()){
            cheap= temp.getPrice();
        }
        return cheap ; //TODO careful when count is located at 0 in an the array
    }


    //given attributes
    protected String brand;
    protected double price;
    protected int horsepower;

    //constructor

    //default constructor
    public Airplane(){
        brand="Boeing";
        price= 250000.00;
        horsepower=1350;
    }
    //parameter constructor
    public Airplane(String mark,double cost, int hp){
        brand=mark;
        price=cost;
        horsepower=hp;
    }

    //copy constructor
    public Airplane(Airplane copy){
        brand=copy.getBrand();
        price=copy.getPrice();
        horsepower=copy.getHorsepower();
    }



    //accessor

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    //mutator

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    //methods



    public boolean equals(Object o) {
        if (this==o) return true;
        if(o==null||(getClass()!=o.getClass()))return false;
        Airplane that =(Airplane) o ;
        return price==that.price &&
                horsepower == that.horsepower &&
                brand.equals(that.brand);
    }


    /**
     * method will out print the airplane object attributes and override the default to string method
     * @return airplane object brand, price, and horsepower
     */
    @Override
    public String toString() {
        return "This Airplane is made by" +
                " '" + brand + '\'' +
                ", it costs $" + price +
                " , it is capable of producing " + horsepower +
                " horsepower.";
    }


}
