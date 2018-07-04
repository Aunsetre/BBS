package com.aunsetre.pojo;

import java.util.Date;

public class UserLog {
    private Integer lid;

    private Short userid;

    private Date logintime;

    private String loginip;

    private Date offline;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Short getUserid() {
        return userid;
    }

    public void setUserid(Short userid) {
        this.userid = userid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Date getOffline() {
        return offline;
    }

    public void setOffline(Date offline) {
        this.offline = offline;
    }
}