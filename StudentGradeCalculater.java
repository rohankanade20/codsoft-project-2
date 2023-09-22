/*This is a java program of student grade calculator. which is showing total Marks, Average Percentage and Grade according to percentage*/


import java.util.Scanner;

public class StudentGradeCalculater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();

        double totMarks = 0.0;
        double avePercentage;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter your marks obtained in subject " + i + ":");
            double marks = sc.nextDouble();
            totMarks += marks;
        }

        // Calculate Total Marks
        System.out.println("Total Marks: " + totMarks);

        // Calculate Average Percentage
        avePercentage = (totMarks / (numSubjects * 100)) * 100;
        System.out.println("Average Percentage: " + avePercentage + "%");

        // Grade Calculation
        String grade;
        if (avePercentage >= 90) {
            grade = "A+";
        } else if (avePercentage >= 80) {
            grade = "A";
        } else if (avePercentage >= 65) {
            grade = "B";
        } else if (avePercentage >= 55) {
            grade = "C";
        } else if (avePercentage >= 35) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Results
        System.out.println("your Grade is: " + grade);

        sc.close();
    }
}