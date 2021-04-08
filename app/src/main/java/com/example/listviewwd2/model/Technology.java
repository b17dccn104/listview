package com.example.listviewwd2.model;

public class Technology {
    private int image;
    private String sub, title, content;

    public Technology(int image, String sub, String title, String content) {
        this.image = image;
        this.sub = sub;
        this.title = title;
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Technology(){

    }
}
