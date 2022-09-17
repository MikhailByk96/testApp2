package testapp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Book")
public class BookModel {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long Id;
    @Column(name = "nameBook", nullable = false)
    private String NameBook;

    @OneToMany(mappedBy = "author")
    private Set<AuthorModel> authors;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String nameBook) {
        NameBook = nameBook;
    }

    public Set<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorModel> authors) {
        this.authors = authors;
    }
}
