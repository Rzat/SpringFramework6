package com.poc.springframework6.repositories;

import com.poc.springframework6.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
