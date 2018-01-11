package com.cassandra.poc.CassandraSpring.service;

import com.cassandra.poc.CassandraSpring.model.Book;

import java.util.List;

public interface BookService {

    List<Book> listAll();

//    Iterable<Book> getByTitleAndPublisher(String title, String publisher);

    Book saveOrUpdate(Book book);
}
