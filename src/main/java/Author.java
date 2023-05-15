import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
    private int id;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {return  id;}

    public void setId(int id) {this.id = id;}

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
