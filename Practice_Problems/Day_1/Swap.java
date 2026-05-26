import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter Value of B: ");
        int b = sc.nextInt();

        System.out.println("The value of A and B before swap :" + "a = " + a + " b = " + b);
        a = a + b;  // ! a = 30
        b = a - b;  // ! b = 10
        a = a - b;  // ! a = 20

        System.out.println("The value of A and B after swap :" + "a = " + a + " b = " + b);
        
    }
}
