package com.poc.springframework6.services;

import com.poc.springframework6.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
