
class rectangle{
            int height,width;
        
        
        public rectangle(int height,int width){
            this.height=height;
            this.width=width;

        }
        public String toString(){
            return "The height is "+ Integer.toString(height)+"\n"+"The width is "+ Integer.toString(width)+"\n"+"The area of rectangle is "+Integer.toString(height*width);
        }
        
    }
public class Qno17 {
    
    public static void main(String[] args) {
        rectangle a = new rectangle(12, 1);
        System.out.println(a);
        
    }
}