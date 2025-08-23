package com.LibraryApi.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "books")

public class Book {
    @Id
    private Long id;
    private String title;
    private String authorId;
    private String genre;
    private Integer yearPublished;
    private Author author;


}
