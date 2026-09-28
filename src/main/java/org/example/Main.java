package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {

        Student student1 = new Student("Jack", "Smith", "12345");
        Student student2 = new Student("Jane", "Greene", "12346");
        Student student3 = new Student("Max", "Black", "12347");

        List<Student> students = new ArrayList<>();
        MySchool school = new MySchool();

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);


        //school.listAllStudents();
        Student foundStudent = school.findStudentById("12346");
        System.out.println(foundStudent);

        school.deleteStudentById("12346");


    }
}
