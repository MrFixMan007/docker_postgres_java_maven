package com.example.demo.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "countryid")
    public Long countryId;
    @Column(name = "authorid")
    public Long authorId;
    @Column(name = "genreid")
    public Long genreId;

    public Book() {}
}
