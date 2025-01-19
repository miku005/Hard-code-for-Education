package com.EducationDetails.entity;

public class EducationDetails {

    private String name;
    private String degree;
    private String university;
    private int yearOfPassing;

    public EducationDetails(String name,  String degree,String university, int yearOfPassing) {
        this.name = name;
        this.degree = degree;
        this.university = university;
        this.yearOfPassing = yearOfPassing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }
}