import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library("Central Neptune");
        book = new Book("Biological Universe", "Wallace Arthur", "Science");
    }

    @Test
    public void bagStartsEmpty(){
        assertEquals(0, borrower.borrowedBookCount());
    }

    @Test
    public void borrowsBookFromLibrary(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        borrower.borrowsBook(book);
        assertEquals(1, borrower.borrowedBookCount());
        assertEquals(2, library.bookCount());
    }
}
