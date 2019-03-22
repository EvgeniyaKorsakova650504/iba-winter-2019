package com.example.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name="name")
    @NotNull
    private String  name;

    @Column(name="login")
    @NotNull
    private String login;

    @Column(name="password")
    @NotNull
    private String password;

    @Column(name="course")
    @NotNull
    private Integer course;

    @Column(name="university")
    @NotNull
    private String university;

    public Student() {
    }

    public Student(Integer id, String name, String login, String password, Integer course, String university) {
        Id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.course = course;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", course=" + course +
                ", university='" + university + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Integer getCourse() {
        return course;
    }

    public String getUniversity() {
        return university;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
