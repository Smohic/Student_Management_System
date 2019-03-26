package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        System.out.print("Enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[numOfStudents];

        for(int i = 0; i < numOfStudents; i++)
        {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for(int i = 0; i < numOfStudents; i++)
        {
            System.out.println(students[i].toString());
        }

    }
}
