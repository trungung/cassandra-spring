package com.cassandra.poc.CassandraSpring;

import com.cassandra.poc.CassandraSpring.model.Book;
import com.cassandra.poc.CassandraSpring.service.BookService;
import com.datastax.driver.core.utils.UUIDs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CassandraSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CassandraSpringApplication.class, args);
    }

    @Autowired
    private BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        bookService.saveOrUpdate(new Book(UUIDs.timeBased(), "Head First Java", "O'Reilly Media"));
    }
}