package p1;

import p2.Helicopter;
import p2.Quadcopter;
import p3.Multirotor;
import p4.UAV;
import p5.Agriculturaldrone;
import p5.MAV;

public class assing2 {
    public static void main(String[] args){
        System.out.println("lets hope this works");
        Helicopter heli = new Helicopter("boeing", 2500.00,3,2000,13,24);
        Quadcopter quad= new Quadcopter("Airbus",350.00,6500,2,2015,0,250);
        Multirotor multi= new Multirotor("Lockheed",340.50,55500,34,2007,10,9);
        UAV little= new UAV(350.76,7.56);
        Agriculturaldrone butter  = new Agriculturaldrone(450.62,12.63,3);
        MAV snitch= new MAV(450.23,.52,"DJI",13.52);
        Airplane plane=new Airplane("Fokker",32500.52,400000);


        System.out.println("the heli : "+heli+
                            "\n\nThe quadcopter is : "+quad+
                            "\n\nThe Multi rotor is : "+multi+
                            "\n\nThe UAV rotor is : "+little+
                            "\n\nThe Agricultural drone is rotor is : "+butter+
                            "\n\nThe MAV rotor is : "+snitch+
                            "\n\nThe Airplane is: "+plane);

        Object[] aviation = new Object[20];

        aviation[0]=  new MAV(450.23,.52,"DJI",13.52);
        aviation[1]= new Helicopter("boeing", 2500.00,3,2000,13,24);
        aviation[2]= new Helicopter("boeing", 2500.00,3,2000,13,24);
        aviation[3]= aviation[2];
        aviation[4]= new Helicopter("boeing", 2500.50,3,2000,13,24);

        MAV coke= (MAV)aviation[0];
        System.out.println("the mav: "+aviation[0]);
        System.out.println("the heli: "+aviation[1]+"\n\n");
        System.out.println("is object 1 equal to object 3? :"+aviation[0].getClass().);




    }
}
