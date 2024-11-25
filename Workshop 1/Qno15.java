
class Person{
            String hair,eyes;
        
        public Person() {
            hair ="Brown";
            eyes ="Black";

        }
        public Person(String hair,String eyes){
            this.hair=hair;
            this.eyes=eyes;

        }
        public void display(){
            System.out.println(hair);
            System.out.println(eyes);
        }
        
    }
public class Qno15 {
    
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person("Red","Blue");
        a.display();
        b.display();
    }
}