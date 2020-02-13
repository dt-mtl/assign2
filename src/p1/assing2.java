package p1;

import p2.Helicopter;
import p2.Quadcopter;

public class assing2 {
    public static void main(String[] args){
        System.out.println("lets hope this works");
        Helicopter fuck = new Helicopter("boeing", 2500.00,3,2000,13,24);
        Quadcopter hola= new Quadcopter("Airbus",350.00,6500,2,2015,0,250);

        System.out.println("the heli fuck: "+fuck+"\n\nThe quadcopter is : "+hola);
    }
}
