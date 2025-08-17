package Dto;

public class AuthurDto {
    public static class AuthorDto {
        public Long id;
        public String name;
        public String bio;

        public AuthorDto() {}
        public AuthorDto(Long id, String name, String bio) {
            this.id = id; this.name = name; this.bio = bio;
        }
    }
}
