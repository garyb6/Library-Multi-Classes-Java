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

    public boolean checkCapacity(){
        if (this.collection.size() == 10){
            return true;
        } else {
            return false;
        }
    }

    public void addBook(Book book) {
        if (this.collection.size() <= 9) {
            this.collection.add(book);
        }
    }

    public Book removeBook(){
        return this.collection.remove(0);
    }
}

