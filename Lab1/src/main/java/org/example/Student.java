package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Student extends Person {
    private String student_id;
    private List<String> enrolled_courses;


    public Student(String name, String email, String student_id) {
        super(name, email);
        this.student_id = student_id;
        this.enrolled_courses = new ArrayList<>();
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String studentId) {
        this.student_id = student_id;
    }

    public List<String> getEnrolled_courses() {
        return enrolled_courses;
    }

    public void enrollCourse(String courseCode) {
        enrolled_courses.add(courseCode);
    }



    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + student_id + ", Enrolled Courses: " + enrolled_courses;
    }


    public abstract double calculateGpA(List<Course> courses);


}
