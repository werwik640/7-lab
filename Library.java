import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {

        books = new ArrayList<>();
    }

    public void addBook(Book book) {

        books.add(book);
    }

    public void removeBook(String title) {

        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public ArrayList<Book> findBookByAuthor(String author) {

        ArrayList<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                authorBooks.add(book);
            }
        }
        System.out.println("Книги автора:" + authorBooks);
        return authorBooks;
    }

    public void printAllBooks() {

        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            System.out.println("Книги в библиотеке:");
            for (Book book : books) {
                book.printInfo();
                System.out.println();
            }
        }
    }
}