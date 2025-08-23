package com.LibraryApi.Repository;

import com.LibraryApi.Entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}