package com.LibraryApi.Dto;

import lombok.Data;

@Data
public class BookResponseDTO {
    private String id;
    private String title;
    private String genre;
    private int yearPublished;

    private AuthorResponseDTO author;
}