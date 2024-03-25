import java.util.Scanner;
public class ARRAY{
        static Scanner na = new Scanner(System.in);
    public static void main(String[] args) {
        String[] name;
        String[] name2 = new String[5];
        String[] name3 = {"Micheal","Favour","Ayodele"};
        //accessing array element by index
        name2[0] = "John";
        name2[2] = "Jane";
        name2[4] = "Tom";
        
        System.out.println(name3[1]);
        System.out.println(name2[2]);

        // Let check the length of the arary
        System.out.println(name2.length);


        String arr = name2.toString();//converting an array to a string using .toString() method
        System.out.println("The Array is : "+arr); 

        // using for each to loop over the array
        for(String na:name2){
            System.out.println(na);
        }
        for(int i=0; i<name2.length; i++){
            System.out.println(name2[i]);
        }
         char option;
        System.out.print("The current president of Nigeria is ___ (a) Buhari (b) Tinubu (c) Jonathan (d) Obasanjo: ");
        option = na.next().charAt(0);

        switch (option) {
            case 'a':
                System.out.println("You missed, it's not Buhari");
                break;
            case 'b':
                System.out.println("Congratulations, you are correct");
                break;
            case 'c':
                System.out.println("You missed, it's not Jonathan");
                break;
            case 'd':
                System.out.println("You missed, it's not Obasanjo");
                break;
            default:
                System.out.println("Invalid option entered");
                break;
        }
    }
}