// src/com/school/AttendanceRecord.java
package com.school;

public class AttendanceRecord {
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;

        // Validate status
        if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Warning: Invalid status entered. Defaulted to 'Invalid'.");
        }
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Getter for courseId
    public int getCourseId() {
        return courseId;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Display record details
    public void displayRecord() {
        System.out.println("Student ID: S" + studentId +
                           ", Course ID: C" + courseId +
                           ", Status: " + status);
    }
}
