package Dto;
import Dto.AuthurDto.*;

public class BookDto {
    public Long id;
    public String title;
    public String genre;
    public Integer yearPublished;
    public AuthorDto author;

    public BookDto() {}
    public BookDto(Long id, String title, String genre, Integer yearPublished, AuthurDto.AuthorDto author) {
        this.id = id; this.title = title; this.genre = genre;
        this.yearPublished = yearPublished; this.author = author;
    }
}

