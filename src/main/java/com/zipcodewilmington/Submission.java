package com.zipcodewilmington;

public class Submission {

    private int id;
    private int studentId;
    private int assignmentId;

    public Submission(int id, int studentId, int assignmentId) {
        this.id = id;
        this.studentId = studentId;
        this.assignmentId = assignmentId;
    }

    public Submission(int studentId, int assignmentId) {
        this.studentId = studentId;
        this.assignmentId = assignmentId;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }
}
