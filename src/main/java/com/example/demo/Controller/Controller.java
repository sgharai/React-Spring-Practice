package com.example.demo.Controller;

import com.example.demo.Model.Movie;
import com.example.demo.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, this app is working!";
    }

    @Autowired
    MovieRepo movieRepo;

    @GetMapping("/movies")
    public Iterable<Movie> getMovies(){
        return movieRepo.findAll();
    }

    @PostMapping("/movies")
    Movie newMovie(@RequestBody Movie newMovie) {
        return movieRepo.save(newMovie);
    }

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("name", "Sofia");

        return mav;
    }
}