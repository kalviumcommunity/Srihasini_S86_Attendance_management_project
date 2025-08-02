package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance Management System!");

        // Students
        Student[] students = new Student[2];
        students[0] = new Student("Hasini", 101);
        students[1] = new Student("Ravi", 102);

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayInfo();
        }

        // Courses
        Course[] courses = new Course[2];
        courses[0] = new Course("Mathematics", "MATH101");
        courses[1] = new Course("Computer Science", "CS102");

        System.out.println("\n--- Course Details ---");
        for (Course c : courses) {
            c.displayInfo();
        }
    }
}
