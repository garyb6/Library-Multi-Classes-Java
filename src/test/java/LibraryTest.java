import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Central");
        book = new Book("Biological Universe", "Wallace Arthur", "Science");
    }

    @Test
    public void hasName(){
        assertEquals("Central", library.getName());
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, library.bookCount());
    }
}
