package ru.soyma.firstBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bookName;
    private String authorName;
    private String authorSurname;
    private String authorPatrionacy;

    public Post() { }
    public Post(String bookName, String authorName, String authorSurname, String authorPatrionacy) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorPatrionacy = authorPatrionacy;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorPatrionacy() {
        return authorPatrionacy;
    }

    public void setAuthorPatrionacy(String authorPatrionacy) {
        this.authorPatrionacy = authorPatrionacy;
    }
}
