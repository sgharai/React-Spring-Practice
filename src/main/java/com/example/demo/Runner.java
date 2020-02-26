package com.example.demo;

import com.example.demo.Model.Movie;
import com.example.demo.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public void run(String... args) throws Exception {
        movieRepo.save(new Movie("Toy Story", 1995, "family"));
    }
}
