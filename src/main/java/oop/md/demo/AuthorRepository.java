package oop.md.demo;
import java.util.List;
import java.util.ArrayList;
public class AuthorRepository {
    List<String> authors = new ArrayList<>();

    public AuthorRepository() {
        authors.add("J.K.Rowling");
        authors.add("Ioan Slavici");
        authors.add("Tim Johnson");
        authors.add("David Copelfields");
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthors(String name) {
        authors.add(name);
    }

    public void delAuthors(String name) {
        authors.remove(name);

    }
}
