package br.gov.camara.ditec.adm.sivis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.camara.ditec.adm.sivis.repository.model.Book;
import br.gov.camara.ditec.adm.sivis.service.BookService;


@RestController
public class BookController {
	
    @Autowired
    private BookService bookService;
    

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping("/update/{id}/{pages}")
    public String updateBook(@PathVariable int id, @PathVariable int pages) {
        return bookService.updateBook(id,pages);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        return  bookService.deleteBook(id);
       
    }
    @GetMapping("/getInfo/{id}")
    public void getInfo(@PathVariable  int id){
    	bookService.getInfo(id);
    }

    @GetMapping("/books")
    public List<Book> listBooks(){
        return bookService.listBooks() ;
    }
 


}
