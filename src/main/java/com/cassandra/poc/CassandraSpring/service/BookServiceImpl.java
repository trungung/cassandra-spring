package com.cassandra.poc.CassandraSpring.service;

import com.cassandra.poc.CassandraSpring.model.Book;
import com.cassandra.poc.CassandraSpring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository productRepository) {
        this.bookRepository = productRepository;
    }

    @Override
    public List<Book> listAll() {
        List<Book> products = new ArrayList<>();
        bookRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Book saveOrUpdate(Book book) {
        bookRepository.save(book);
        return book;
    }
}
