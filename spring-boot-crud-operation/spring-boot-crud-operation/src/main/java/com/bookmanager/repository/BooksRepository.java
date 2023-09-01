package com.bookmanager.repository;
import org.springframework.data.repository.CrudRepository;

import com.bookmanager.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
