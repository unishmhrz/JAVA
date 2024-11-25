import java.util.Scanner;
public class Qno11 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double kilo;
        System.out.println("Enter the length in miles");
         double mile = scanner.nextDouble();
         kilo=mile*1.60934;
         System.out.println("Length in kilometer is "+ kilo);
    }
}