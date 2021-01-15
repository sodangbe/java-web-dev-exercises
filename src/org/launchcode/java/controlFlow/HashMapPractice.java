package org.launchcode.java.controlFlow;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> roster = new HashMap<>();

        String newStudent;

        System.out.println("Student and ID : ");
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                roster.put(newID,newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        input.close();
        System.out.println("Roster");

        for(Map.Entry<Integer, String> student: roster.entrySet()){
            System.out.println(student.getValue() + "'s ID:" + student.getKey());
        }

        int size = roster.size();
        String result = String.format("Number of students :%s", size);
        System.out.println(result);
    }
}
