package com.cassandra.poc.CassandraSpring.model;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.mapping.CassandraType;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Table("book_abc")
public class Book implements Serializable {
    @PrimaryKey
    @CassandraType(type = DataType.Name.UUID)
    private UUID id;
    private String title;
    private String publisher;

    public Book(final UUID id, final String title, final String publisher) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }
}