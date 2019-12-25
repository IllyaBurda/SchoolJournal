package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Tutor tutFirst = new Tutor("Petr Ivanovich");
        School schoolFirst = new School("22", "Nekakaya st");
        Student student = new Student("John");
        SchoolClass schoolClass = new SchoolClass("11A");
        schoolFirst.addTutor(tutFirst.name);
        schoolClass.addStudent(student);
        Lesson lesson = new Lesson(Subjects.Chemistry, LocalDateTime.now());
        schoolFirst.setSubject(tutFirst.name, Subjects.Chemistry, "11a");
        schoolFirst.setLesson(schoolClass.name, Subjects.Chemistry, LocalDateTime.now());
        tutFirst.setMarks(lesson, student.name, 1);

    }
}
