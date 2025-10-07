package org.example;

import java.util.List;

public class Graduate extends Student {
    private boolean degree;

    public Graduate(String name, String email, String student_id) {
        super(name, email, student_id);
        this.degree = false;


    }

    @Override
    public double calculateGpA(List<Course> courses) {
        double totalPoints = 0;
        int totalCredits = 0;
        for (Course co : courses) {
            totalPoints += co.getCredits() * 1.0;
            totalCredits += co.getCredits();
        }

        return totalCredits == 0 ? 0 : Math.ceil((totalPoints / totalCredits) * 100.0) / 100.0;
    }
public String toString(){
    return super.toString() + ", Degree: " + degree ;
}
}