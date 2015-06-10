package hbadhani.messenger.model;

import java.util.Date;

/**
 * Created by hbadhani on 09/06/2015.
 */
public class Comment {
    long id;
    String author;
    Date created;
    String comment;

    public Comment(){}

    public Comment(Long id, String author,String comment) {
        this.id = id;
        this.author = author;
        this.created = new Date();
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
