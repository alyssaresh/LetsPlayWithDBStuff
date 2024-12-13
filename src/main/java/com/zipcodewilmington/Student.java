package com.zipcodewilmington;

public class Student {
    private String name;
    private int id;
    private String notes;
    private String classroom;

    public Student(int id, String name, String classroom, String notes) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getNotes() {
        return notes;
    }
}
