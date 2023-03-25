package com.poc.springframework6.repositories;

import com.poc.springframework6.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book, Long> {
}
