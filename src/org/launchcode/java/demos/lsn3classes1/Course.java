package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private double creditHours;
    private String courseTitle;
    private ArrayList<Student> classRoster;

    public Course (double creditHours, String courseTitle, ArrayList<Student> classRoster) {
        this.creditHours = creditHours;
        this.courseTitle = courseTitle;
        this.classRoster = classRoster;
    }

    public Course (double creditHours, String courseTitle) {
        this.creditHours = creditHours;
        this.courseTitle = courseTitle;
    }

}
