package org.launchcode.java.controlFlow;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) throws FileNotFoundException {
        //String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your test:");
        String textRaw = new String();
        File file = new File("C:\\test.txt");
        Scanner scannedFile = new Scanner(file);

        while (scannedFile.hasNextLine()){
             textRaw = scannedFile.nextLine();
        }


           //String textRaw = input.nextLine();
           String textRawNa = textRaw.toLowerCase();
           String text = textRawNa.replaceAll("[^a-z]", "");

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i=0; i<text.length()-1; i++){
            if (hashMap.containsKey(text.charAt(i))) {
                int count = hashMap.get(text.charAt(i));
                hashMap.put(text.charAt(i), ++count);
            } else {
                hashMap.put(text.charAt(i),1);
            }
        }
        //System.out.println("Counting occurrences of each character = "+hashMap);
        for(Map.Entry<Character, Integer> character: hashMap.entrySet()){
            System.out.println(character.getValue() + ":" + character.getKey());
        }
    }
}
