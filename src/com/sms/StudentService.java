package com.sms;

import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {

        if(students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for(Student s : students) {
            s.display();
        }
    }

    public void deleteStudent(int id) {

        Student found = null;

        for(Student s : students) {
            if(s.getId() == id) {
                found = s;
                break;
            }
        }

        if(found != null) {
            students.remove(found);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

}
