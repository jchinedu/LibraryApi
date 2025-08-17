package Entity;

public class Book {
    private Long id;
    private String title;
    private String genre;
    private Integer yearPublished;
    private Author author;

    public Book() {}
    public Book(String title, String genre, Integer yearPublished, Author author) {
        this.title = title;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
