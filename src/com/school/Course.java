package com.school;

public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }
}
