import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Patron> patrons = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    public void borrowBook(Book book, Patron patron) {
        
        System.out.println(patron.getFullName() + " borrowed " + book.getTitle());
    }
   
    

    public void returnBook(Book book, Patron patron) {
        System.out.println(patron.getFullName() + " returned " + book.getTitle());
    }
}