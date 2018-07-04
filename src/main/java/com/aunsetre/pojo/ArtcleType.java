package com.aunsetre.pojo;

public class ArtcleType {
    private Short atid;

    private String name;

    public Short getAtid() {
        return atid;
    }

    public void setAtid(Short atid) {
        this.atid = atid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}