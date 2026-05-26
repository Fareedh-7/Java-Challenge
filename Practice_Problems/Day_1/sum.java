import java.util.Scanner;

public class sum {      // ! Defining the Class
    public static void main (String[] args){        // ! Main method
        Scanner sc = new Scanner(System.in);        // ! using scanner class for taking input from user

            // * Sytem.in -  Grabs the raw binary data from the console when you press keys on your keyboard.
            // * sc -  Takes that raw binary data and formats it into usable Java data types like String, int, or double 
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println(sum);

        System.out.println("The Sum of a and b is: " + (a + b));

        sc.close();    
    }
}

