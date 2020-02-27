package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BookController {
    @Autowired
    BookRepo bookRepo;

//    @GetMapping("/books")
//    public Iterable<Book> getBooks(){
//        return bookRepo.findAll();
//    }

    @PostMapping("/books")
    Book newBook(@RequestBody Book newBook) {
        return bookRepo.save(newBook);
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    ModelAndView showBooks() {
        ModelAndView mav = new ModelAndView("books");
        mav.addObject("books", bookRepo.findAll());
        return mav;
    }
}
