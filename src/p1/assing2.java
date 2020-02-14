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
        UAV little= new UAV("DJI",450.25,7,5.61);
        Agriculturaldrone butter  = new Agriculturaldrone("Sandisk", 432.60, 5,20.45,1);
        MAV snitch= new MAV("Arduino",334.56,8,4.32,"SNITCH",8.54);
        Airplane plane=new Airplane("Fokker",32500.52,400000);


        System.out.println("the heli : "+heli+
                            "\n\nThe quadcopter is : "+quad+
                            "\n\nThe Multi rotor is : "+multi+
                            "\n\nThe UAV rotor is : "+little+
                            "\n\nThe Agricultural drone is rotor is : "+butter+
                            "\n\nThe MAV rotor is : "+snitch+
                            "\n\nThe Airplane is: "+plane);
    }
}
