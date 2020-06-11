package br.gov.camara.ditec.adm.sivis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.camara.ditec.adm.sivis.repository.BookRepository;
import br.gov.camara.ditec.adm.sivis.repository.model.Book;

@Service
public class BookService {
	
	@Autowired
    private BookRepository repository;
    

    public Book saveBook(Book book) {
        return repository.save(book);
    }


    public String updateBook( int id, int pages) {
        Book book = repository.findById(id).get();
        book.setPages(pages);
        repository.save(book);
        return "nook updated";
    }


    public String deleteBook(int id) {
        repository.deleteById(id);
        return "book deleted";
    }

    public void getInfo (int id){
      //  System.out.println(repository.findLastChangeRevision(id));
    }

    public List<Book> listBooks(){
        return repository.findAll();
    }
  
  

}
