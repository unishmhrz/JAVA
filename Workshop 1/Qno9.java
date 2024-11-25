import java.util.Scanner;
public class Qno9 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double div;
        int add,sub,mul;
        System.out.println("Enter the first number");        
         int a = scanner.nextInt();
         System.out.println("Enter the second number");
         int b = scanner.nextInt();
         div = b/a;
         add=a+b;
         sub=a-b;
         mul=a*b;
         System.out.println("Addition is "+ add);
         System.out.println("Multiplication is "+ mul);
         System.out.println("Division is "+ div);
         System.out.println("Subtraction is "+ sub);
    }
}