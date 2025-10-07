package org.example;

public class course {
    private int course_id;
    private String course_name;
    private String course_code;
    private int credits;


    public course(String course_name,  String course_code, int credits) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.credits = credits;


    }
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String email) {
        this.course_name = course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String name) {
        this.course_code = course_code;
    }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }




}


