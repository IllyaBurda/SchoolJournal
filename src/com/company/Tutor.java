package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Tutor {
    String name;
    HashMap<Subjects, ArrayList<String>> disciplines = new HashMap<Subjects, java.util.ArrayList<String>>();

    public Tutor(String name) {
        this.name = name;
    }
    public void setMarks(Lesson lesson,String name,int mark){

    }
    public void setStudentStatus(Lesson lesson,String name,StudentStatus studentStatus){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return name.equals(tutor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
