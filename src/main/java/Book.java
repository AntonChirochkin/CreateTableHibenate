import javax.persistence.*;

@Entity
public class Book {
    private int id;
    private String name;
    private Author authorByAuthorId;

    @Id
    @Column(name ="id", nullable = false)
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    public Author getAuthorByAuthorId() {return authorByAuthorId;}

    public void setAuthorByAuthorId(Author authorByAuthorId) {this.authorByAuthorId = authorByAuthorId;}

}
