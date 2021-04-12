package com.group1.carecenter.entity;

import java.util.Date;

public class Clientin {
    private Integer id;

    private Integer bedid;

    private Integer clientid;

    private Integer nurseid;

    private Date timein;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBedid() {
        return bedid;
    }

    public void setBedid(Integer bedid) {
        this.bedid = bedid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getNurseid() {
        return nurseid;
    }

    public void setNurseid(Integer nurseid) {
        this.nurseid = nurseid;
    }

    public Date getTimein() {
        return timein;
    }

    public void setTimein(Date timein) {
        this.timein = timein;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}