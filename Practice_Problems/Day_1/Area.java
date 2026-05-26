import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        Double radius = sc.nextDouble();

        Double area = 3.14 * radius * radius;   // ! Formula for finding area of circle

        System.out.println("The area of the circle is " + area);

        sc.close();
    }
}
