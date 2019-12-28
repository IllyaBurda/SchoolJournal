package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class SchoolClass {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    Map<Lesson, List<Record>> journal = new HashMap<>();

    public SchoolClass(String name) {
        this.name = name;
    }

    public void addStudent(Student newStudent) {

    }

    public void addStudent(String name) {

    }

    public boolean searchStudent(String studentName) {
        boolean result = false;
        for (Student student : students) {
            if (student.name.equals(studentName)) {
                result = true;
            }
        }
        return result;
    }

    public List<Lesson> searchSubjectInformation(String studentName, Subjects subject) {
        if (searchStudent(studentName) == false) {
            System.out.println("Такой ученик не учиться в классе");
            return null;
        }
        final List<Record> totalRecord=new ArrayList<>();


    }

    List<Record> generateRecords() {
        List<Record> result = new ArrayList<>();
        for (Student student : students) {
            result.add(new Record(student, 0, StudentStatus.Absent));
        }
        return result;
    }

    public boolean moveStudentToAnotherClass(Student student, SchoolClass anotherClass) {
        return true;
    }

    public boolean moveStudentToAnotherClass(Student student, String classNumber) {
        return true;
    }

}
