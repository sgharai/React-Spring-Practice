package com.example.demo;

import com.example.demo.Model.Book;
import com.example.demo.Model.Movie;
import com.example.demo.Repository.BookRepo;
import com.example.demo.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private BookRepo bookRepo;

    @Override
    public void run(String... args) throws Exception {
        movieRepo.save(new Movie("Toy Story", 1995, "family"));
        movieRepo.save(new Movie("Hercules", 1997, "family"));
        movieRepo.save(new Movie("Errementari: The Blacksmith and the Devil", 2018, "dark fantasy"));
        bookRepo.save(new Book("Good Omens", 1990, "fantasy"));
        bookRepo.save(new Book("The Golem and the Jinni", 2013, "fantasy"));
        bookRepo.save(new Book("Your Heart Is a Muscle the Size of a Fist", 2016, "political fiction"));


    }
}
