package com.example.demo.Repository;

import com.example.demo.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
