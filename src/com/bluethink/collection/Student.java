package com.bluethink.collection;

public class Student {
    public Student(String firstName, String lastName, int age, double cgpa, String collegeName, String yearInCollege) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cgpa = cgpa;
        this.collegeName = collegeName;
        this.yearInCollege = yearInCollege;
    }

    private String firstName;
    private String lastName;
    private int age;
    private double cgpa;
    private String collegeName;

    private String yearInCollege;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getYearInCollege() {
        return yearInCollege;
    }

    public void setYearInCollege(String yearInCollege) {
        this.yearInCollege = yearInCollege;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                ", cgpa=" + cgpa +
//                ", collegeName='" + collegeName + '\'' +
//                '}';
//    }
}
