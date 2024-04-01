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
        System.out.println("Caculating CGPA!");
    }

    public static void createCBTTest(Scanner scanner) {
        System.out.println("Taking the Computer Based Test (CBT)!");
    }

}