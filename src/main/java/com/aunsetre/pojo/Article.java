package com.aunsetre.pojo;

import java.util.Date;

public class Article {
    private Integer aid;

    private String title;

    private Date releasetime;

    private Integer likes;

    private Short atid;

    private Short authorid;

    private Integer clickrate;

    private String context;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Short getAtid() {
        return atid;
    }

    public void setAtid(Short atid) {
        this.atid = atid;
    }

    public Short getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Short authorid) {
        this.authorid = authorid;
    }

    public Integer getClickrate() {
        return clickrate;
    }

    public void setClickrate(Integer clickrate) {
        this.clickrate = clickrate;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}