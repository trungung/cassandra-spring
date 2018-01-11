package com.cassandra.poc.CassandraSpring.repository;

import com.cassandra.poc.CassandraSpring.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("bookRepository")
public interface BookRepository extends CrudRepository<Book, UUID> {

//    @Query("select * from book where title = ?0 and publisher=?1")
//    Iterable<Book> findByTitleAndPublisher(String title, String publisher);
}