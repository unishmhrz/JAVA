import java.util.Scanner;
public class Qno6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f;
         System.out.println("Enter the value in celcius");
         double celcius = scanner.nextDouble();
         f = celcius * 9/5 + 32;
         System.out.println("Fahrenheit"+ f);
    }
}