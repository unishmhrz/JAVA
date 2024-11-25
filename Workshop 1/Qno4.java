public class Qno4 {
    
    public static void main(String[] args) {
        int a = 4, b = 5, c = 7,s;
        double area;
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the traingle is "+area);

    }
}