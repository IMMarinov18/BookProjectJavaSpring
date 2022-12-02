package dev.tyanko.h2demo.repository;

import dev.tyanko.h2demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
