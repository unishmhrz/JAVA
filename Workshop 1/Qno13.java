import java.util.Scanner;
public class Qno13 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double totalcost;
        System.out.println("Enter the quantity");        
         int quantity = scanner.nextInt();
         System.out.println("Enter the price");
         double price = scanner.nextDouble();
         totalcost=quantity*price;
         System.out.println("Total cost is "+ totalcost);
        
    }
}