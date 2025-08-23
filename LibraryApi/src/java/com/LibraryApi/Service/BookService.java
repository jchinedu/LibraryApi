package com.LibraryApi.Service;


import com.LibraryApi.Dto.BookRequestDTO;
import com.LibraryApi.Dto.BookResponseDTO;
import com.LibraryApi.Entity.Author;
import com.LibraryApi.Entity.Book;
import com.LibraryApi.Repository.AuthorRepository;
import com.LibraryApi.Repository.BookRepository;
import org.springframework.stereotype.Service;
import com.LibraryApi.util.DtoMapper;

import java.util.List;

@Service
    public class BookService {
    private final BookRepository bookRepo;
    private final AuthorRepository authorRepo;

    public BookService(BookRepository bookRepo, AuthorRepository authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    public List<BookResponseDTO> getAllBooks() {
        return bookRepo.findAll().stream()
                .map(book -> DtoMapper.toBookResponse(book, findAuthor(book.getAuthorId())))
                .toList();
    }

    public BookResponseDTO getBookById(String id) {
        return bookRepo.findById(id)
                .map(book -> DtoMapper.toBookResponse(book, findAuthor(book.getAuthorId())))
                .orElse(null);
    }

    public BookResponseDTO createBook(BookRequestDTO dto) {
        Book book = bookRepo.save(DtoMapper.toBookEntity(dto));
        return DtoMapper.toBookResponse(book, findAuthor(book.getAuthorId()));
    }

    public BookResponseDTO updateBook(String id, BookRequestDTO dto) {
        Book book = DtoMapper.toBookEntity(dto);
        book.setId(Long.valueOf(id));
        book = bookRepo.save(book);
        return DtoMapper.toBookResponse(book, findAuthor(book.getAuthorId()));
    }

    public void deleteBook(String id) {
        bookRepo.deleteById(id);
    }


    private Author findAuthor(String authorId) {
        return authorRepo.findById(authorId).orElse(null);
    }
}