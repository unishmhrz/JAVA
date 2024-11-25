import java.util.Scanner;
public class Qno8 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double si;
        System.out.println("Enter the Principle");        
         double principle = scanner.nextDouble();
         System.out.println("Enter the Time");
         double time = scanner.nextDouble();
           System.out.println("Enter the Rate");
         double rate = scanner.nextDouble();
         si=(principle*time*rate)/100;
         System.out.println("Simple Interest of the amount is "+ si);
    }
}