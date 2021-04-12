package com.group1.carecenter.entity;

import java.util.Date;

public class UserLeave {
    private Integer id;

    private Integer clientid;

    private Date leavetime;

    private String reason;

    private String escortman;

    private String escortphone;

    private Date returntime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getEscortman() {
        return escortman;
    }

    public void setEscortman(String escortman) {
        this.escortman = escortman == null ? null : escortman.trim();
    }

    public String getEscortphone() {
        return escortphone;
    }

    public void setEscortphone(String escortphone) {
        this.escortphone = escortphone == null ? null : escortphone.trim();
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }
}