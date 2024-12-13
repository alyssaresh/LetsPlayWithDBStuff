package com.zipcodewilmington;

public class TMeta {

    private int id;
    private int teacher_id;
    private int years;
    private int roomNum;

    public TMeta(int roomNum, int years, int teacher_id) {
        this.roomNum = roomNum;
        this.years = years;
        this.teacher_id = teacher_id;
    }

    public TMeta(int id, int roomNum, int years, int teacher_id) {
        this.id = id;
        this.roomNum = roomNum;
        this.years = years;
        this.teacher_id = teacher_id;
    }

    public int getRoomNumber() {
        return roomNum;
    }

    public int getYears() {
        return years;
    }

    public int getTeacher_Id() {
        return teacher_id;
    }

    public int getId() {
        return id;
    }

}
