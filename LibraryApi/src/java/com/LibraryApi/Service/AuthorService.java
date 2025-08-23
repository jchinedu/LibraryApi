package com.LibraryApi.Service;


import com.LibraryApi.Dto.AuthorRequestDTO;
import com.LibraryApi.Dto.AuthorResponseDTO;
import com.LibraryApi.Entity.Author;

import com.LibraryApi.Repository.AuthorRepository;

import org.springframework.stereotype.Service;
import com.LibraryApi.util.DtoMapper;

import java.util.List;


@Service
public class AuthorService {

    private final AuthorRepository repo;

    public AuthorService(AuthorRepository repo) {
        this.repo = repo;
    }

    public List<AuthorResponseDTO> getAllAuthors() {
        return repo.findAll().stream().map(DtoMapper::toAuthorResponse).toList();
    }

    public AuthorResponseDTO getAuthorById(String id) {
        return repo.findById(id).map(DtoMapper::toAuthorResponse).orElse(null);
    }

    public AuthorResponseDTO createAuthor(AuthorRequestDTO dto) {
        Author author = repo.save(DtoMapper.toAuthorEntity(dto));
        return DtoMapper.toAuthorResponse(author);
    }

    public AuthorResponseDTO updateAuthor(String id, AuthorRequestDTO dto) {
        Author author = DtoMapper.toAuthorEntity(dto);
        author.setId(id);
        return DtoMapper.toAuthorResponse(repo.save(author));
    }

    public void deleteAuthor(String id) {
        repo.deleteById(id);
    }
}


