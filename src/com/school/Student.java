// src/com/school/Student.java
package com.school;

public class Student extends Person {
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        super(name); // Calls the constructor in Person
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Displays ID and Name from Person
        System.out.println("Role: Student");
        System.out.println("Grade Level: " + gradeLevel);
    }
}
