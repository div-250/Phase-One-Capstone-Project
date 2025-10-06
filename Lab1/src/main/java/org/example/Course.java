package org.example;

public class Course {
    private String course_code;
    private String course_name;
    private int credits;
    private Instructor instructor;

    public Course(String courseCode, String courseName, int credits) {
        this.course_code = courseCode;
        this.course_name = courseName;
        this.credits = credits;
    }

    public String getCourseCode() { return course_code; }
    public void setCourseCode(String courseCode) { this.course_code = courseCode; }

    public String getCourseName() { return course_name; }
    public void setCourseName(String courseName) { this.course_name = courseName; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    @Override
    public String toString() {
        return "Course Code: " + course_code +
                ", Name: " + course_name +
                ", Credits: " + credits +
                ", Instructor: " + (instructor != null ? instructor.getName() : "None");
    }
}
