package com.company;

import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Tutor {
    String name;
    HashMap<Subject, List<String>> disciplines = new HashMap<>();

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
