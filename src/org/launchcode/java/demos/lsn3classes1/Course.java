package org.launchcode.java.demos.lsn3classes1;

public class Course {

    private double creditHours;
    private String courseTitle;
    private ArrayList<Student> classRoster;

    public Course (creditHours, courseTitle, classRoster) {
        this.creditHours = creditHours;
        this.courseTitle = courseTitle;
        this.classRoster = classRoster;
    }

    public Course (creditHours, courseTitle) {
        this.creditHours = creditHours;
        this.courseTitle = courseTitle;
    }

}
