package com.LibraryApi.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "authors")

public class Author {
    @Id
    private String id;
    private String name;
    private String bio;
    private List<Book> books = new ArrayList<>();


}
