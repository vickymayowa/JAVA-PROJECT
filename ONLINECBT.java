import java.util.Scanner;

public class ONLINECBT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Let write a program that will ask for the user to start the application
        System.out.println("Welcome to the CBT JAVA Application!!");
        System.out.println("1 : Start the Application");
        System.out.println("2 : End the Application");
        System.out.println("Enter your choice =>");
        int choice = scanner.nextInt();
        // let use the switch case method
        switch (choice) {
            case 1:
                startApplication(scanner);
            case 2:
                startApplication(scanner);
                break;
            default:
                System.out.println("Invalid Choice! Please enter again.");
        }
    }

    public static void startApplication(Scanner scanner) {
        System.out.println("What would you like to do?");
        System.out.println("1 - Calculate CGPA");
        System.out.println("2 - Take a CBT Test");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateCGPA(scanner);
                break;
            case 2:
                createCBTTest(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting the Application.");
        }
    }

    public static void calculateCGPA(Scanner scanner) {
        System.out.println("WELCOME TO MY CGPA CALCULATOR APPLICATION USING JAVA");
        System.out.println("KINDLY ENTER YOUR NAME :=>");
        String name = scanner.nextLine();
        System.out.println("KINDLY ENTER YOUR DEPARTMENT :=>");
        String className = scanner.nextLine();

        // Define the number of courses
        System.out.println("Enter the number of courses:");
        int numCourses = scanner.nextInt();
        double[] courseScores = new double[numCourses];
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter score for Course " + (i + 1) + ":");
            courseScores[i] = scanner.nextDouble();
        }

        // Calculate CGPA
        double cgpa = calculateCGPA(courseScores);

        // Display CGPA
        System.out.println("Hello " + name + "!");
        System.out.println("Class: " + className);
        System.out.println("Your CGPA is: " + cgpa);

        scanner.close();
    }

    // Method to calculate CGPA
    public static double calculateCGPA(double[] scores) {
        // Convert scores to grade points
        double totalGradePoints = 0;
        for (double score : scores) {
            totalGradePoints += convertToGradePoint(score);
        }

        // Calculate CGPA (average grade points)
        double cgpa = totalGradePoints / scores.length;
        return cgpa;
    }

    
    // Method to convert score to grade point
    public static double convertToGradePoint(double score) {
        if (score >= 70) {
            return 5.0;
        } else if (score >= 60) {
            return 4.0;
        } else if (score >= 50) {
            return 3.0;
        } else if (score >= 45) {
            return 2.0;
        } else if (score >= 40) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static void createCBTTest(Scanner scanner) {
        System.out.println("Taking the Computer Based Test (CBT)!");
    }

}