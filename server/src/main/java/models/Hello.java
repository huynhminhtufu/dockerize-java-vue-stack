package com.mrhmt.server.models;

import javax.persistence.*;

@Entity
@Table(name="hello")
public class Hello {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String userAgent;
    private String meta;

    public Hello(String userAgent, String meta) {
        this.userAgent=userAgent;
        this.meta=meta;
    }

    public Hello() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent=userAgent;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta=meta;
    }
}
