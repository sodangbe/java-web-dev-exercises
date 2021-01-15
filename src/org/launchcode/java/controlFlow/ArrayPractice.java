package org.launchcode.java.controlFlow;

import java.util.ArrayList;
import java.util.Scanner;
import  java.util.Arrays;

public class ArrayPractice {

   public static void main(String[] args) {
        int[] arrayOfNumber =  {1, 1, 2, 3, 5, 8};

        int n = arrayOfNumber.length ;

        for (int i= 0 ; i < n ; i++){
            System.out.println(arrayOfNumber[i]);
        }

//        for(int integer: arrayOfNumber){
//
//            System.out.println(integer);
//        }


       String str ="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

       // String[] words= str.split(" ");
       String[] words= str.split("\\.");
       //System.out.println(Arrays.toString(words));
       for(String word : words){
           System.out.println(word);
       }
    }

}
