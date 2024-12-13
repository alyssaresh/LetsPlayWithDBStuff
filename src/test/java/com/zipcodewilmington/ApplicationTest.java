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
}
