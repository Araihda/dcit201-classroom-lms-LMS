/*
 * This should be your main class where all your objects will be created
 */

public class App{
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Pride and Prejudice", "Jane Austen", "1813");
        Book book2 = new Book("Great Expectations", "Charles Dickens", "1861");
        Book book3 = new Book("Animal Farm", "George Orwell", "1945"); 

        Patron patron1 = new Patron("Kay Ansah", "22224422", "Resident", "0242356880");
        Patron patron2 = new Patron("Angela Bliss", "22059220", "Non-Resident", "0506112422");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addPatron(patron1);
        library.addPatron(patron2);
        
        library.borrowBook(book1, patron1);
        library.borrowBook(book2, patron2);
        library.returnBook(book1, patron1);
        library.returnBook(book2, patron2);
    }
}



