package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolClass {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    Map<Lesson,ArrayList<Record>> journal = new HashMap<>();

    public SchoolClass(String name) {
        this.name = name;
    }

    public void addStudent(Student newStudent) {

    }

    public void addStudent(String name) {

    }

    public boolean moveStudentToAnotherClass(Student student, SchoolClass anotherClass) {

    }

    public boolean moveStudentToAnotherClass(Student student, String schoolNumber) {

    }

}
