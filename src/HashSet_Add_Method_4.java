import java.util.HashSet;

public class HashSet_Add_Method_4 {
    public static void main(String[] args){
        HashSet<Book> set = new HashSet<Book>();
        Book b1 = new Book(102,"let us C", "Yashwant kanetkar", "BPB",8);
        Book b2 = new Book(103,"Data COmmunication & Networking", "Forouzan", "Mc Graw Hill", 4 );
        Book b3 = new Book(104, "Operating System", "Galvin", "Wiley",6);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        System.out.println(set);
        for(Book b:set){
            System.out.println(b.id +" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
class Book{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
