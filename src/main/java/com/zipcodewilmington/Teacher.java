package com.zipcodewilmington;

public class Teacher {


    private final String firstName;
    private final String lastName;
    private final Specialty specialty;
    private int id;

    public enum Specialty {FRONT_END, MIDDLE_TIER, DATA_TIER}

    public Teacher(String first_name, String last_name, Specialty specialty) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.specialty = specialty;
    }

    public Teacher(int id, String first_name, String last_name, Specialty specialty) {
        this.id = id;
        this.firstName = first_name;
        this.lastName = last_name;
        this.specialty = specialty;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getId(){
        return id;
    }

    public Specialty getSpecialty(){
        return specialty;
    }
}
