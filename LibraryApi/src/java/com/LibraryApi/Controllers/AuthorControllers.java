package com.LibraryApi.Controllers;

import com.LibraryApi.Dto.AuthorRequestDTO;
import com.LibraryApi.Dto.AuthorResponseDTO;
import com.LibraryApi.Service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorControllers {
    private final AuthorService authorService;

        public AuthorControllers(AuthorService authorService) {
            this.authorService = authorService;
        }

    @GetMapping
    public List<AuthorResponseDTO> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorResponseDTO getAuthorById(@PathVariable String id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public AuthorResponseDTO createAuthor(@Valid @RequestBody AuthorRequestDTO dto) {
        return authorService.createAuthor(dto);
    }

    @PutMapping("/{id}")
    public AuthorResponseDTO updateAuthor(@PathVariable String id,
                                          @Valid @RequestBody AuthorRequestDTO dto) {
        return authorService.updateAuthor(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable String id) {
        authorService.deleteAuthor(id);
    }
}