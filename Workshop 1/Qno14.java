import java.util.Scanner;
public class Qno14 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double nep;
        System.out.println("Enter the amt in usd");        
        int usd = scanner.nextInt();
        System.out.println("Enter the rate");        
        double rate = scanner.nextDouble();
        nep=usd*rate;
        System.out.println("Amt in nep is "+ nep);
        
    }
}