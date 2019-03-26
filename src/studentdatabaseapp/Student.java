package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = sc.nextLine();

        System.out.println("Enter student class level:");
        System.out.println("1 - Freshmen");
        System.out.println("2 - Sophomore");
        System.out.println("3 - Junior");
        System.out.println("4 - Senior");
        this.gradeYear = Integer.parseInt(sc.nextLine());

        setStudentID();
    }

    private void setStudentID()
    {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll()
    {

        do
        {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses += "\n  " + course;
                tuitionBalance += costOfCourse;
            }else { break; }
        }while(1 != 0);
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    }

    public void viewBalance()
    {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition()
    {
        System.out.print("Enter your payment: $");
        Scanner sc = new Scanner(System.in);
        int payment = Integer.parseInt(sc.nextLine());
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public String toString()
    {
        return "\nName: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }


}
