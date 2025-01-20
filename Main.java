import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book2 = new Book("Горе от ума", "Александр Грибоедов", 1822);
        Book book3 = new Book("Анна Каренина", "Лев Толстой", 1878);
        Book book4 = new Book("Недоросль", "Денис Фонвизин", 1782);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.printAllBooks();

        library.findBookByAuthor("толст");

        library.removeBook("Преступление и наказание");
        library.printAllBooks();
    }
}