package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");

        double r= s.nextDouble();
        if (r<0 ){
        //double  area=(3.14*r*r) ;
            System.out.println("The number cannot be negative");
        }else {
            System.out.println("Area of Circle is: " + Circle.getArea(r));
        }
    }
}
