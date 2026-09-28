package org.example;

import java.util.ArrayList;
import java.util.List;

public class MySchool implements School {

    private List<Student> students = new ArrayList<>();


    @Override
    public void addStudent(Student obj) {
        students.add(obj);
    }

    public void listAllStudents() {
        System.out.println(students);
    }

    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudentById(String studentId) {
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)) {
                students.remove(i);
                System.out.println("Student " + studentId + " was deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The student id was not found.");
        }
    }



}



