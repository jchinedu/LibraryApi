package com.LibraryApi.Dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookRequestDTO {
    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "AuthorId is required")
    private String authorId;

    private String genre;

    @NotNull(message = "Year published is required")
    private Integer yearPublished;
}
