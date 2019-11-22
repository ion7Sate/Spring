package oop.md.demo;
import java.util.ArrayList;
import java.util.List;
public class BookRepository {
    List<String> books = new ArrayList<>();

    public BookRepository() {
        books.add("Harry Potter ");
        books.add("Avalon");
        books.add("Demonii");
        books.add("Mara");
        books.add("Lucifer");
    }

    public List<String> getBooks(){
        return books;
    }

    public void addBooks(String name){
        books.add(name);
    }



}
