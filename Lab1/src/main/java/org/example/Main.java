package org.example;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Niyitegeka Thierry", "thierry@uni.edu", "22206741");
        Student student2 = new Student("Abdoul Razak", "razak@uni.edu", "222004356");

        Instructor instructor1 = new Instructor("Vincent Niyigaba", "vincent@uni.edu","mechanical engineering" );

        Course course1 = new Course("CS101", "Introduction to Programming", 30);
        Course course2 = new Course("CS201", "Data Structures", 45);

        course1.setInstructor(instructor1);
        course2.setInstructor(instructor1);
        instructor1.assignCourse("CS101");
        instructor1.assignCourse("CS201");


        student1.enrollCourse("CS101");
        student1.enrollCourse("CS201");
        student2.enrollCourse("CS101");

        // Display information

        System.out.println("=== Students ===");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("\n=== Instructor ===");
        System.out.println(instructor1);

        System.out.println("\n=== Courses ===");
        System.out.println(course1);
        System.out.println(course2);
    }


}