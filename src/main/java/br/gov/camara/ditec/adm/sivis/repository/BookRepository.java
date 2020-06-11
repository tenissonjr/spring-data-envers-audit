package br.gov.camara.ditec.adm.sivis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import br.gov.camara.ditec.adm.sivis.repository.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> 
    ,RevisionRepository<Book, Integer, Integer>{
}
