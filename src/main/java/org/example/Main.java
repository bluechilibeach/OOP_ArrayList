package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Jack", "Smith", 12345);
        Student student2 = new Student("Jane", "Greene", 12346);
        Student student3 = new Student("Max", "Black", 12347);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

    }
}
