package com.gutrend.BeMonNgon.models;

import jakarta.persistence.*;



@Entity
@Table(name = "tbStudent")
/*
CREATE TABLE tbStudent(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(255),
birthYear INT,
* */


public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer birthYear;

    public Student() {
    }

    public Student( String name, Integer birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
