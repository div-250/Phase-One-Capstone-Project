package org.example;



import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("chantal", "chantal@edu.com","MEE");

        Course course1 = new Course("Java", "CS101", 2, instructor1);
        Course course2 = new Course("Python", "CS102", 4, instructor1);
        Course course3 = new Course("C++", "CS103", 3, instructor1);
        UndergraduateStudent student1 = new UndergraduateStudent("ineza","ineza@edu.com","223344445","MEE");
        UndergraduateStudent  student2 = new  UndergraduateStudent("Jane", "jane@edu.com", "2345678", "ETE");
        UndergraduateStudent    student3 = new  UndergraduateStudent("Joe", "joe@edu.com", "223475094", "EEE");
        Graduate student4 = new Graduate("Mike", "mike@edu", "222394049");
        Graduate student5 = new Graduate("Mary", "mary@edu.com", "CS");


        course2.EnrollStudent(student1);
        course2.EnrollStudent(student2);
        course2.EnrollStudent(student3);
        course3.EnrollStudent(student4);
        course3.EnrollStudent(student5);
        course1.EnrollStudent(student1);
        course1.EnrollStudent(student2);
        course1.EnrollStudent(student3);

        instructor1.assignCourse(course1);
        instructor1.assignCourse(course2);
        instructor1.assignCourse(course3);
        System.out.println(instructor1);
        System.out.println(" assigned courses: " + instructor1.getTeaching_courses().size());
        System.out.println(" roster size: " + instructor1.getCourseRoster().size());
        System.out.println(student1.getName() + " GPA = " + student1.calculateGpA(instructor1.getTeaching_courses()));
        System.out.println(student2.getName() + " GPA = " + student2.calculateGpA(instructor1.getTeaching_courses()));
        System.out.println(student3.getName() + " GPA = " + student3.calculateGpA(instructor1.getTeaching_courses()));
        System.out.println(student4.getName() + " GPA = " + student4.calculateGpA(instructor1.getTeaching_courses()));
        System.out.println(student5.getName() + " GPA = " + student5.calculateGpA(instructor1.getTeaching_courses()));


        List<Course> instructorCourses = instructor1.getTeaching_courses();

        List<Course> courses = Arrays.asList(course1, course2, course3);

        System.out.println(instructor1.getTeaching_courses());

            }

    }

