package com.lingxi;

/**
 * 欢迎信息
 */
public class Greeting {

    private  Long id;
    private  String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}