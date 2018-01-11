package com.cassandra.poc.CassandraSpring.controller;

import com.cassandra.poc.CassandraSpring.model.Book;
import com.cassandra.poc.CassandraSpring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBooks() {
        return bookService.listAll();
    }
}
