package com.bluethink.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<String> level = List.of(new String[]{"fresher", "junior", "senior", "graduate"});

        //System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  professor's class he/she will be teaching: ");
        String teach = sc.nextLine();

        System.out.println("Enter the  professor's firstName: ");
        String firstName = sc.nextLine();

        System.out.println("Enter the  professor's lastName: ");
        String lastName = sc.nextLine();

        System.out.println("Enter the  professor's age: ");
        Integer age = sc.nextInt();

        System.out.println("Enter the  no of year  professor has taught : ");
        Integer experience = sc.nextInt();

        System.out.println("Enter the  no of student to enroll ");
        Integer noOfStudentEnroll = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();


        if(noOfStudentEnroll>0){


            for (int i = 0; i <noOfStudentEnroll ; i++) {

                System.out.println("Enter the  Student's studentFirstName: ");
                String studentFirstName = sc.next();

                System.out.println("Enter the  Student's studentLastName: ");
                String studentLastName = sc.next();

                System.out.println("Enter the  Student's Age: ");
                Integer studentAge = sc.nextInt();


                System.out.println("Enter the  Student's Cgpa: ");
                double studentCgpa = sc.nextDouble();

                System.out.println("Enter the  Student's collegeName: ");
                String collegeName = sc.next();

                boolean yes=true;
                while (yes) {
                    System.out.println("Enter the year in college (Fresher,Junior,Senior,Graduate)");
                    String yearInCollege=sc.next();
                    if (level.contains(yearInCollege.toLowerCase())) {
                        students.add(new Student(studentFirstName, studentLastName, studentAge, studentCgpa, collegeName, yearInCollege));
                        yes=false;
                    } else {
                        System.out.println("Value not matched");
                    }
                }




            }
           Professor professor = new Professor(teach,firstName,lastName,experience,age,noOfStudentEnroll,students);

            System.out.println("Enrollment Information: ");
            System.out.println("Professor "+ professor.getFirstName()+" "+professor.getLastName()+" will be teaching course "+professor.getTeach()+". ");
            System.out.println("Professor "+professor.getLastName()+" has  been  teaching for "+professor.getExperience()+" year. ");
            System.out.println("The course will have "+ professor.getNoOfStudentEnroll()+" enrolled. ");
            System.out.println("---------------------------------------------------------------------");

            System.out.println("The student  Information is as followed: ");
            int i=0;
            for (Student student:professor.getStudents()) {

                System.out.println("---------------------------------------------------------------------");

                System.out.println("student # "+ ++i +"'s information:  ");
                System.out.println("first name: " +student.getFirstName());
                System.out.println("Last name:  "+student.getLastName());
                System.out.println("Student of age "+student.getAge());
                System.out.println("CGPA: "+student.getCgpa());
                System.out.println("College Name:  "+student.getCollegeName());
                System.out.println("Year in College Name:  "+student.getYearInCollege());


                System.out.println("---------------------------------------------------------------------");

            }


        }
    }
}