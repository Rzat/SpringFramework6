package com.poc.springframework6.services;

import com.poc.springframework6.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
