package p2;

public class Quadcopter extends Helicopter{

    //given attributes
    protected int maxFSpeed;  //max flying speed

    //constructors

    //Default constructor
    public Quadcopter(){
        super();
        maxFSpeed=200;
    }
    //parameter constructor
    public Quadcopter(String mark,double cost, int hp, int cyl, int create, int cap,int maxSpeed){
        super(mark,cost ,hp,cyl,create,cap);
        maxFSpeed=maxSpeed;
    }

    //copy constructor
    public Quadcopter(Quadcopter copy){
        brand=copy.getBrand();
        price=copy.getPrice();
        horsepower=copy.getHorsepower();
        cylinders=copy.getCylinders();
        createYear=copy.getCreateYear();
        capacity=copy.getCapacity();
        maxFSpeed=copy.getMaxFSpeed();
    }

    //accessors
    public int getMaxFSpeed() {
        return maxFSpeed;
    }
    //mutator

    public void setMaxFSpeed(int maxFSpeed) {
        this.maxFSpeed = maxFSpeed;
    }
    //methods
    public String toString() {
        return "This Quadcopter is made by" +
                " '" + brand + '\'' +
                ", it costs $" + price +
                " , it is capable of producing " + horsepower +
                " horsepower.\nIt has " + cylinders+
                " cylinders, and was created in the year "+ createYear+
                " , it can carry up to "+capacity+
                " passengers, and flies at a max speed of "+ maxFSpeed+" KM/h";
    }

    //equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null||(getClass()!=o.getClass())) return false;
        Quadcopter that = (Quadcopter) o;

        return brand.equals(that.brand)&&
                price == that.price&&
                horsepower==that.horsepower&&
                cylinders == that.cylinders &&
                createYear == that.createYear &&
                capacity == that.capacity&&
                maxFSpeed==that.maxFSpeed;
    }
}
