package com.aunsetre.pojo;

public class UserType {
    private Short utypeid;

    private String name;

    public Short getUtypeid() {
        return utypeid;
    }

    public void setUtypeid(Short utypeid) {
        this.utypeid = utypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}