package com.LibraryApi.Controllers;

import com.LibraryApi.Dto.BookRequestDTO;
import com.LibraryApi.Dto.BookResponseDTO;
import com.LibraryApi.Service.BookService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControllers {
    private final BookService bookService;

    public BookControllers(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookResponseDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookResponseDTO getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public BookResponseDTO createBook(@Valid @RequestBody BookRequestDTO dto) {
        return bookService.createBook(dto);
    }

    @PutMapping("/{id}")
    public BookResponseDTO updateBook(@PathVariable String id,
                                      @Valid @RequestBody BookRequestDTO dto) {
        return bookService.updateBook(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }
}