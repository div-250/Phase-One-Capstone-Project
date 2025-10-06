package org.example;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {
    private String department;
    private List<String> teaching_courses;

    public Instructor(String name, String email, String department) {
        super(name,email);
        this.department = department;
        this.teaching_courses = new ArrayList<>();

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getTeaching_courses() {
        return teaching_courses;
    }

    public void assignCourse(String courseCode) {
        teaching_courses.add(courseCode);
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Teaching Courses: " + teaching_courses;
    }

    public String getName() {


        return "";
    }
}
