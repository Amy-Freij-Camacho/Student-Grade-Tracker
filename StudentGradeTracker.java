/**
 * 
 */
/**
 * 
 */
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        
        System.out.print("Enter the number of assignments: ");
        int numAssignments = scanner.nextInt();

        
        double[][] grades = new double[numStudents][numAssignments];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            for (int j = 0; j < numAssignments; j++) {
                System.out.print("Enter grade for Assignment " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
        }

       
        double[] averageGrades = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double totalGrade = 0;
            for (int j = 0; j < numAssignments; j++) {
                totalGrade += grades[i][j];
            }
            averageGrades[i] = totalGrade / numAssignments;
        }

        
        System.out.println("\nFeedback for each student:");

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Average Grade: " + averageGrades[i]);
            System.out.println("Feedback: " + getFeedback(averageGrades[i]));
            System.out.println();
        }

        scanner.close();
    }

    
    private static String getFeedback(double averageGrade) {
        if (averageGrade >= 90) {
            return "Excellent! Keep up the good work.";
        } else if (averageGrade >= 80) {
            return "Good job! You're doing well.";
        } else if (averageGrade >= 70) {
            return "You're doing okay. Keep improving.";
        } else if (averageGrade >= 60) {
            return "You need to work harder to improve.";
        } else {
            return "You need to significantly improve your performance.";
        }
    }
}