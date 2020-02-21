package p1;


import p2.*;
import p3.*;
import p4.*;
import p5.*;
public class assing2 {



    public static void main(String[] args){

        double cheap=0; //variable that will hold the cheapest item
        int location=0;

        Helicopter heli = new Helicopter("boeing", 3500.00,3,2000,13,24);
        Quadcopter quad= new Quadcopter("Airbus",650.00,6500,2,2015,0,250);
        Multirotor multi= new Multirotor("Lockheed",6340.50,55500,34,2007,10,9);
        UAV little= new UAV(250.23,7.56);
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

        FlyingObject[] aviation = new FlyingObject[20];

        aviation[0]= new MAV(450.15,.52,"DJI",13.52);
        aviation[1]= new Helicopter("boeing", 2500.00,3,2000,13,24);
        aviation[2]= new Helicopter("boeing", 451.20,3,2000,19,24);
        aviation[3]= aviation[2];
        aviation[4]= new Helicopter("boeing", 449.21,3,2000,10,24);
        aviation[5]=heli;
        aviation[6]=quad;
        aviation[7]=multi;
        aviation[8]=little;
        aviation[9]=butter;
        aviation[10]=snitch;
        aviation[11]=plane;

        MAV coke= (MAV)aviation[0];
        System.out.println("the mav: "+aviation[0]);
        System.out.println("the heli: "+aviation[1]+"\n\n");
        System.out.printf("is object 1 equal to object 3? :%s%n", ((MAV) aviation[0])) ;
        System.out.println();
        System.out.println();
        for(int i =0;i<12;i++){
            if (i==0){
                cheap = aviation[i].getCost(aviation[i]);
            }else{
                System.out.println(i);
                if(cheap > aviation[i].getCost(aviation[i])) {
                    cheap = aviation[i].getCost(aviation[i]);
                    location=i;
                }
            }
        }

        System.out.println("the cheapest item is at location "+location+" it is:"+aviation[location]);




    }
}
