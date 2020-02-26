package com.example.demo.Repository;

import com.example.demo.Model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie, Long> {
}
