package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class School {
    String schoolNumber;
    String street;
    Set<Tutor> tutors = new HashSet<>();

    public School(String schoolNumber, String street) {
        this.schoolNumber = schoolNumber;
        this.street = street;
    }

    public boolean addTutor(String tutorName) {

    }

    public void setSubject(String tutorName, Subjects subject, String classNumber) {

    }

    public void deleteSubject(String tutorName, Subjects subject, String... classNumber) {

    }

    public void setLesson(String classNumber, Subjects subject, LocalDateTime time) {

    }


}
