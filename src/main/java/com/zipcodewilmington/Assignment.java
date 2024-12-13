package com.zipcodewilmington;

public class Assignment {
    private int id;
    private int teacher_id;
    private String url;
    private String name;

    public Assignment(String name, String url, int teacher_id) {
        this.name = name;
        this.url = url;
        this.teacher_id = teacher_id;
    }

    public Assignment(int id, String name, String url, int teacher_id) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.teacher_id = teacher_id;
    }

    public String getName() {
        return name;
    }


    public String getUrl() {
        return url;
    }

    public int getTeacherId() {
        return teacher_id;
    }

    public int getId() {
        return id;
    }
}
