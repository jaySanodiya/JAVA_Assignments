package assignment.D703;

import java.util.Scanner;

class Main{

    public static void main(String[] args) {


        System.out.println("Well-come to Modern Higher Secondary School");
        System.out.println("=====================++====================");
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter RollNumber");
        int roll = sn.nextInt();

        System.out.println("Enter StudentName");
        String name = sn.next();

        System.out.println("Enter Marks");
        int marks = sn.nextInt();

        System.out.println("=====================++====================");
        Bean Student = new Bean();
        Student.setRoll(roll);
        Student.setName(name);
        Student.setMarks(marks);

        System.out.println("Student Roll Number Is :- "+ Student.getRoll());
        System.out.println("Student Name Is :- "+Student.getName());
        System.out.println("Student Marks Is :- "+Student.getMarks());

        System.out.println("------------------------------------------");

        System.out.println("Thankyou...!!!!");
    }
}