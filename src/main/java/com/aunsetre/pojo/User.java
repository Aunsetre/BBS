package com.aunsetre.pojo;

import java.util.Date;

public class User {
    private Short uid;

    private String username;

    private String password;

    private String email;

    private Short usertypeid;

    private String active;

    private Date registertime;

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(Short usertypeid) {
        this.usertypeid = usertypeid;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }
}