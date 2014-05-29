package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: john
 * @version: 1.0 2014-05-29 13:37
 */
@Entity
public class Hotel {

    @Id
    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
