package oop.md.demo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tools")

public class MyApp {
    BookRepository bRep = new BookRepository();
    AuthorRepository aRep = new AuthorRepository();

    @GetMapping("/books")
    public List<String> booksList(){
        return bRep.getBooks();
    }

    @GetMapping("/authors")
    public List<String> authorsList(){
        return aRep.getAuthors();
    }

    @PostMapping("/addBook/{name}")
    public void addBook(@PathVariable("name") String name){
        bRep.addBooks(name);
    }

    @PutMapping("/addAuthor/{name}")
    public void addAuthor(@PathVariable("name") String name) {
        aRep.addAuthors(name);
    }

    @DeleteMapping("/delAuthor/{name}")
    public void delAuthor(@PathVariable("name") String name) {
        aRep.delAuthors(name);
    }


}
