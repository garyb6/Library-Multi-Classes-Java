import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Central Neptune");
        book = new Book("Biological Universe", "Wallace Arthur", "Science");
    }

    @Test
    public void hasName(){
        assertEquals("Central Neptune", library.getName());
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void checkIfLibraryIsUnderCapacityOf10() {
        assertEquals(false, library.checkCapacity());
    }
    @Test
    public void checkIfLibraryIsAtCapacityOf10() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.checkCapacity());
    }

    @Test
    public void canAddBookToCollectionOnlyIfCapacityAllows(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(10, library.bookCount());
    }
}
