package org.example;

import java.util.Date;

public class Post {
    private String Title;
    private long Id;
    private String Description;
    private String Content;
    private Date LastUpdatedAt;
    private Date PostedAt;

    public Post() {
    }

    public Post(String title, long id, String description, String content, Date lastUpdatedAt, Date postedAt) {
        Title = title;
        Id = id;
        Description = description;
        Content = content;
        LastUpdatedAt = lastUpdatedAt;
        PostedAt = postedAt;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getLastUpdatedAt() {
        return LastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        LastUpdatedAt = lastUpdatedAt;
    }

    public Date getPostedAt() {
        return PostedAt;
    }

    public void setPostedAt(Date postedAt) {
        PostedAt = postedAt;
    }
}
