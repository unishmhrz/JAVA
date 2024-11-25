
class Book{
            String tittle,author;
            int year;
     
        public Book(String tittle,String author, int year){
            this.tittle=tittle;
            this.author=author;
            this.year=year;

        }
        public String toString(){
            return "Tittle of the book is "+tittle+"\n"+ "Author of the book is "+author+"\n"+"Release Date is "+year;
           
        }
        
    }
public class Qno16 {
    
    public static void main(String[] args) {
        Book a = new Book("Life","Unish",1234);
       System.out.println(a);
        
        
    }
}