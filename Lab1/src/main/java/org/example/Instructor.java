package org.example;

import java.util.*;

public class Instructor extends Person {
    private String department;
    private List<Course> teaching_courses;
    private Map<Course, Set<Student>> course_roster;


    public Instructor(String name, String email, String department) {
        super(name, email);
        this.department = department;
        this.teaching_courses = new ArrayList<>();
        this.course_roster = new HashMap<>();


    }
    public void setTeachingCourses (Course course){
        this.teaching_courses.add(course);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getTeaching_courses() {
        return teaching_courses;
    }

    public Map<Course, Set<Student>> getCourseRoster() {
        return course_roster;
    }

    public void assignCourse(Course co) {
        teaching_courses.add(co);
        course_roster.put(co, co.getEnrolledStudents());

    }


    @Override
    public String toString() {
        return super.toString() +
                ", department='" + department +
                ", assignedCourses=" + teaching_courses.size();


    }


}