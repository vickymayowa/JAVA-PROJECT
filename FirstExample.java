import java.util.Scanner;

public class FirstExample{
    public static void main(String[] args) {
        System.out.println("Welcome to My Java Class Application.Enjoy Yourself Writing Code"); 
    int score = 30;
    long newScore = score;
     System.out.println(newScore);

      Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        System.out.print("Please enter your Age: ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "! Welcome to our application.");
        scanner.close();
    }
}