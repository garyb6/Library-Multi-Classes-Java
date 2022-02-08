import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before (){
        book = new Book ("I, Robot", "Peter Crouch", "Autobiography");
    }

    @Test
    public void hasTitle(){
        assertEquals("I, Robot", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Peter Crouch", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals ("Autobiography", book.getGenre());
    }

}
