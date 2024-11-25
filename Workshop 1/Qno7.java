import java.util.Scanner;
public class Qno7 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double volume;
        System.out.println("Enter the radius of the cyclinder")         
         double radius = scanner.nextDouble();
         System.out.println("Enter the height of the cyclinder");
         double height = scanner.nextDouble();
         volume=(22/7)*radius*radius*height;
         System.out.println("Volume of the cyclinder is "+ volume);
    }
}