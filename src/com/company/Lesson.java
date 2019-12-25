package com.company;


import java.time.LocalDateTime;
import java.util.Locale;

public class Lesson {
    Subjects subject;
    LocalDateTime beginLesson;

    public Lesson(Subjects subject, LocalDateTime beginLesson) {
        this.subject = subject;
        this.beginLesson = beginLesson;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "subject=" + subject +
                ", beginLesson=" + beginLesson +
                '}';
    }
}
