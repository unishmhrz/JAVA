import java.util.Scanner;
public class Qno12 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("Enter the radius");
         double radius = scanner.nextDouble();
         area = Math.PI*radius*radius;
         System.out.println("Area of circle is "+ area);
    }
}