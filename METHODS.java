import java.util.Scanner;
public class METHODS {
    // Method defintition e.g public static void myMethod (){} or public int myMethod (int a){}
    // Method Declarations {System.out.println("This is a java Code")}
    // Method Invocation eg.MyMethod() or MyMethod(5)    
    //  * In Java, methods can be declared as either member methods of classes  
    //  * or as standalone methods outside the class. Member methods are known  
    //  * as non-static methods and they belong to an instance of a class while 
    static Scanner na = new Scanner(System.in);
    public static void displayName(){
        System.err.println("Please Enter your Name");
        String name = na.nextLine();
        System.out.println("My Name is" +name);
    }
    public static void main (String[]args){
        displayName();
    }
}

