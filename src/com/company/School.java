package com.company;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class School {
    String schoolNumber;
    String street;
    Set<Tutor> tutors = new HashSet<>();
    final int maxPupils = 30;
    ArrayList<SchoolClass> listClass = new ArrayList<>();

    {
        for (int i = 1; i < 12; i++) {
            listClass.add(new SchoolClass(i + "А"));
            listClass.add(new SchoolClass(i + "Б"));
            listClass.add(new SchoolClass(i + "В"));
        }
        SchoolClass l_А = listClass.get(0);
        l_А.addStudent("Petrov");
        l_А.addStudent("Nidshe");
        l_А.addStudent("Bruno");
        l_А.addStudent("Feldmann");
        l_А.addStudent("Shumelov");
        l_А.addStudent("Jmixov");
        l_А.addStudent("Dubrovskiy");
        l_А.addStudent("Sidorov");
        l_А.addStudent("Karpov");
        l_А.addStudent("Ivanov");

    }

    public School(String schoolNumber, String street) {
        this.schoolNumber = schoolNumber;
        this.street = street;

    }

    public boolean addTutor(String tutorName) {
        return tutors.add(new Tutor(tutorName));
    }

    public void setSubject(String tutorName, Subjects subject, String... classNumber) {
        ArrayList<String> workClasses = new ArrayList<>();
        Collections.addAll(workClasses, classNumber);
        for (Tutor tutor : tutors) {
            if (tutor.name.equals(tutorName)) {
                tutor.disciplines.put(subject, workClasses);
            }
        }
    }

    public void deleteSubject(String tutorName, Subjects subject, String... classNumber) {
        ArrayList<String> workClasses = new ArrayList<>();
        Collections.addAll(workClasses, classNumber);
        for (Tutor tutor : tutors) {
            if (tutor.name.equals(tutorName)) {
                tutor.disciplines.remove(subject);
            }
        }
    }

    public void setLesson(String classNumber, Subjects subject, LocalDateTime startTime) {
        for (SchoolClass schoolClass : listClass) {
            if (classNumber.equals(schoolClass.name)) {
                Lesson lesson = new Lesson(subject, startTime);
                schoolClass.journal.put(lesson, schoolClass.generateRecords());
            }
        }
    }

    public void printJournal(String classNumber, String subjectName) {
        listClass.stream().filter(schoolClass -> schoolClass.name.equals(classNumber)).forEach(schoolClass -> {
            schoolClass.journal.forEach((L, R) -> {
                if (L.subject.name().equals(subjectName)) {
                    System.out.println(R.toString());
                }
            });
        });
    }

    public void printJournalForStudent(String studentName, String subjectName) {
        final SchoolClass[] tempClass=new SchoolClass[1];
         listClass.stream().filter(schoolClass -> {
             boolean result=schoolClass.searchStudent(studentName);
             if(result==true){
                 tempClass[0]=schoolClass;
             }
             return  result;
         });
    }
}
