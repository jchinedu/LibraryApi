package Service;

import Dto.AuthurDto;
import Dto.AuthurDto.AuthorDto;
import Dto.BookDto;
import Entity.Author;
import Entity.Book;

public class Mapper {
    public static AuthurDto.AuthorDto toDto(Author a) {
        if (a == null) return null;
        return new AuthorDto(a.getId(), a.getName(), a.getBio());
    }

    public static BookDto toDto(Book b) {
        if (b == null) return null;
        return new BookDto(
                b.getId(),
                b.getTitle(),
                b.getGenre(),
                b.getYearPublished(),
                toDto(b.getAuthor())
        );
    }
}

