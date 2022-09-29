package org.example;

import Students.Student;

public class Main {
    public static void main(String[] args) {

    //new instance of Students

    Student student1 = new Student();
    Student student2 = new Student("Hans",26,"Math",false);

    //use setter - methods

    student1.setAge(20);
    student1.setSubject("english");
    student1.setPresent(true);

    //print

    System.out.println(student1.getName());
    System.out.println(student1.isPresent());
    System.out.println(student1.toString());
    }
}