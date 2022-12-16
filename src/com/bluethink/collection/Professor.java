package com.bluethink.collection;

import java.util.List;

public class Professor {


    public Professor(String teach, String firstName, String lastName, Integer experience, Integer age, Integer noOfStudentEnroll, List<Student> students) {
        this.teach = teach;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.age = age;
        this.noOfStudentEnroll = noOfStudentEnroll;
        this.students = students;
    }

    private String  teach;
    private String firstName;
    private String lastName;
    private Integer experience;
    private Integer age;
    private Integer noOfStudentEnroll;

    // Professor have multiple students
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

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

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNoOfStudentEnroll() {
        return noOfStudentEnroll;
    }

    public void setNoOfStudentEnroll(Integer noStudentEnroll) {
        this.noOfStudentEnroll = noStudentEnroll;
    }

   // @Override
//    public String toString() {
//        return "Professor{" +
//                "teach='" + teach + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", experience=" + experience +
//                ", age=" + age +
//                ", noOfStudentEnroll=" + noOfStudentEnroll +
//                ", students=" + students +
//                '}';
//    }
}
