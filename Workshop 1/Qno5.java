import java.util.Scanner;
public class Qno5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
         System.out.println("Enter the length of the square");
         double length = scanner.nextDouble();
         a=length*length;
         System.out.println("The area of the square is "+a);
    }
}