
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE TRACKER =====");

        // Enter student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in English: ");
        double english = sc.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        System.out.print("Enter marks in Science: ");
        double science = sc.nextDouble();

        // Validate marks
        if (english < 0 || english > 100 ||
            maths < 0 || maths > 100 ||
            science < 0 || science > 100) {

            System.out.println("Invalid marks! Enter marks from 0 to 100.");

        } else {

            // Calculate total and average
            double total = english + maths + science;
            double average = total / 3;

            // Calculate grade
            String grade;

            if (average >= 90) {
                grade = "A+";
            } else if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Display result
            System.out.println("\n===== STUDENT RESULT =====");
            System.out.println("Student Name: " + name);
            System.out.println("English Marks: " + english);
            System.out.println("Maths Marks: " + maths);
            System.out.println("Science Marks: " + science);
            System.out.println("Total Marks: " + total + "/300");
            System.out.printf("Average: %.2f%%\n", average);
            System.out.println("Grade: " + grade);

            if (average >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }
        }

        sc.close();
    }
}
