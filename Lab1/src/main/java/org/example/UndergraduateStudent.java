package org.example;

import java.util.List;
import java.util.Map;

public class UndergraduateStudent extends Student {


    private String major;

    public UndergraduateStudent(String name, String email, String student_id, String major) {
        super(name, email, student_id);
        this.major = major;

    }


    @Override

    public double calculateGpA (List<Course> courses){
        double totalPoints = 0;
        int totalCredits = 0;
        for (Course co : courses) {
            totalPoints += co.getCredits() * 1.0;
            totalCredits += co.getCredits();
        }
        return totalCredits == 0 ? 0 : Math.round((totalPoints / totalCredits) * 100.0) / 100.0;
    }

public String toString(){
    return super.toString() + ", Major " + major;

}

}