package com.zipcodewilmington;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    @Test
    public void testBlank(){

    }

    @Test
    public void testStudentCreation() {
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
    public void testTeacherCreation() {
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
}
