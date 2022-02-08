import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;

    public Library(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }
}
