package com.example.studentapp;

public class Student {
    private final String name;
    private final int idStudent;
    private static int id = 0;
    private final String birthday;
    private final String phone;

    public Student(String name, String birthday, String phone) {
        this.name = name;
        this.idStudent = Student.id++;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }


}

