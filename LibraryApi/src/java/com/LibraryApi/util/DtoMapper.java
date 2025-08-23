package com.LibraryApi.util;

import com.LibraryApi.Dto.AuthorRequestDTO;
import com.LibraryApi.Dto.AuthorResponseDTO;
import com.LibraryApi.Dto.BookRequestDTO;
import com.LibraryApi.Dto.BookResponseDTO;
import com.LibraryApi.Entity.Author;
import com.LibraryApi.Entity.Book;

public class DtoMapper {
    public static AuthorResponseDTO toAuthorResponse(Author author) {
        if (author == null) return null;
        AuthorResponseDTO dto = new AuthorResponseDTO();
        dto.setId(String.valueOf(author.getId()));
        dto.setName(author.getName());
        dto.setBio(author.getBio());
        return dto;
    }

    public static Author toAuthorEntity(AuthorRequestDTO dto) {
        Author author = new Author();
        author.setName(dto.getName());
        author.setBio(dto.getBio());
        return author;
    }


    public static BookResponseDTO toBookResponse(Book book, Author author) {
        if (book == null) return null;
        BookResponseDTO dto = new BookResponseDTO();
        dto.setId(String.valueOf(book.getId()));
        dto.setTitle(book.getTitle());
        dto.setGenre(book.getGenre());
        dto.setYearPublished(book.getYearPublished());


        if (author != null) {
            dto.setAuthor(toAuthorResponse(author));
        }

        return dto;
    }

    public static Book toBookEntity(BookRequestDTO dto) {
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setAuthorId(dto.getAuthorId());
        book.setGenre(dto.getGenre());
        book.setYearPublished(dto.getYearPublished());
        return book;
    }
}

