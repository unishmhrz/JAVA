import java.util.Scanner;
public class Qno10 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double perimeter;
        System.out.println("Enter the length of the rectangle");
         double length = scanner.nextDouble();
         System.out.println("Enter the breadth of the rectangle");
         double breadth = scanner.nextDouble();
         perimeter=2*(length+breadth);
         System.out.println("Perimeter of the rectangle is "+ perimeter);
    }
}