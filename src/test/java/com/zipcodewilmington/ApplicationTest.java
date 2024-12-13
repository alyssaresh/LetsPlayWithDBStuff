package com.zipcodewilmington;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    @Test
    public void testBlank(){

    }

    @Test
    public void testStudentGetName() {
        Student student = new Student("Ron Johnson", "1A", "likes Java");
        assertEquals("Ron Johnson", student.getName());
    }

    @Test
    public void testStudentGetId(){
        Student student = new Student(1, "Ron Johnson", "1A", "likes Java");
        assertEquals(1, student.getId());
    }

    @Test
    public void testStudentGetClassroom(){
        Student student = new Student("Ron Johnson", "1A", "likes Java");
        assertEquals("1A", student.getClassroom());
    }

    @Test
    public void testStudentGetNotes(){
        Student student = new Student("Ron Johnson", "1A", "likes Java");
        assertEquals("likes Java", student.getNotes());
    }

    @Test
    public void testTeacherGetFirstName() {
        Teacher teacher = new Teacher("Sam", "Greloch", Teacher.Specialty.MIDDLE_TIER);
        assertEquals("Sam", teacher.getFirstName());
    }

    @Test
    public void testTeacherGetLastName() {
        Teacher teacher = new Teacher("Sam", "Greloch", Teacher.Specialty.MIDDLE_TIER);
        assertEquals("Greloch", teacher.getLastName());
    }

    @Test
    public void testTeacherGetSpecialty() {
        Teacher teacher = new Teacher("Sam", "Greloch", Teacher.Specialty.MIDDLE_TIER);
        assertEquals(Teacher.Specialty.MIDDLE_TIER, teacher.getSpecialty());
    }

    @Test
    public void testTeacherGetId() {
        Teacher teacher = new Teacher(4, "Sam", "Greloch", Teacher.Specialty.MIDDLE_TIER);
        assertEquals(4, teacher.getId());
    }

    @Test
    public void teacherGetRoomNum() {
        TMeta t_meta = new TMeta(2, 4, 1);
        assertEquals(2, t_meta.getRoomNumber());
    }

    @Test
    public void teacherGetYears() {
        TMeta t_meta = new TMeta(2, 4, 1);
        assertEquals(4, t_meta.getYears());
    }

    @Test
    public void teacherGetTeacherId() {
        TMeta t_meta = new TMeta(2, 4, 1);
        assertEquals(1, t_meta.getTeacher_Id());
    }

    @Test
    public void teacherGetId() {
        TMeta t_meta = new TMeta(5,2, 4, 1);
        assertEquals(5, t_meta.getId());
    }

    @Test
    public void assignmentGetName() {
        Assignment assignment = new Assignment("Pokemon Lab", "https://github.com/Zipcoder/PokemonSqlLab", 4);
        assertEquals("Pokemon Lab", assignment.getName());
    }

    @Test
    public void assignmentGetUrl() {
        Assignment assignment = new Assignment("Pokemon Lab", "https://github.com/Zipcoder/PokemonSqlLab", 4);
        assertEquals("https://github.com/Zipcoder/PokemonSqlLab", assignment.getUrl());
    }

    @Test
    public void assignmentGetTeacher_Id() {
        Assignment assignment = new Assignment("Pokemon Lab", "https://github.com/Zipcoder/PokemonSqlLab", 4);
        assertEquals(4, assignment.getTeacherId());
    }

    @Test
    public void assignmentGetId() {
        Assignment assignment = new Assignment(1,"Pokemon Lab", "https://github.com/Zipcoder/PokemonSqlLab", 4);
        assertEquals(1, assignment.getId());
    }

    @Test
    public void submissionGetId() {
        Submission submission = new Submission(1, 40, 3);
        assertEquals(1, submission.getId());
    }

    @Test
    public void submissionGetStudentId() {
        Submission submission = new Submission(40, 3);
        assertEquals(40, submission.getStudentId());
    }

    @Test
    public void submissionGetAssignmentId() {
        Submission submission = new Submission(40, 3);
        assertEquals(3, submission.getAssignmentId());
    }
}
