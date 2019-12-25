package com.company;

public class Record {
    Student student;
    int mark;
    StudentStatus studentStatus;

    public Record(Student student, int mark, StudentStatus studentStatus) {
        this.student = student;
        this.mark = mark;
        this.studentStatus = studentStatus;
    }
}
