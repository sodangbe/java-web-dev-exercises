package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import org.w3c.dom.ls.LSOutput;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    void printStudent(){
        String stud = String.format("Name : %s \nCredits : %s \nGPA : %s",this.name,this.numberOfCredits,this.gpa);
        System.out.println(stud);
    }
    //    public Student(String name, int studentId, int numberOfCredits, double gpa) {
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = numberOfCredits;
//        this.gpa = gpa;
//    }
}