import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.printf("Enter marks for Subject %d (out of 100): ", i);
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                i--; 
            } else {
                totalMarks += marks;
            }
        }
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + calculateGrade(averagePercentage));
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}