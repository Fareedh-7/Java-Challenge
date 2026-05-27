// ! Area of Rectangle
import java.util.Scanner;
public class AOR{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle:");
        Double length = sc.nextDouble();

        System.out.print("Enter the breadth of rectangle:");
        Double breadth = sc.nextDouble();

        Double area = length * breadth;

        System.out.println("The Area of Rectangle is " + area);

        sc.close();
    }
}