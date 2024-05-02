import java.util.Scanner;

public class myAtmClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.println("1. Log in");
            System.out.println("2. Create new account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close(); 
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        // Implement login logic here
        System.out.println("Login functionality not implemented yet.");
    }

    private static void createAccount() {
        // Implement create account logic here
        System.out.println("Create account functionality not implemented yet.");
    }
}
