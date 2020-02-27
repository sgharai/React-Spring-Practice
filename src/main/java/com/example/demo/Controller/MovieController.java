package com.example.demo.Controller;

import com.example.demo.Model.Movie;
import com.example.demo.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MovieController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, this app is working!";
    }

    @Autowired
    MovieRepo movieRepo;

//    @GetMapping("/movies")
//    public Iterable<Movie> getMovies(){
//        return movieRepo.findAll();
//    }

    @PostMapping("/movies")
    Movie newMovie(@RequestBody Movie newMovie) {
        return movieRepo.save(newMovie);
    }

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    ModelAndView showMovies() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("movies", movieRepo.findAll());
        return mav;
    }



}