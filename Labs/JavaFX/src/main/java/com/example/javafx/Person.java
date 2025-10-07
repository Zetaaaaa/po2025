package com.example.javafx;

public class Person {
    String Name;
    String Surname;

    public Person(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
