package com.group1.carecenter.entity;

public class Bed {
    private Integer id;

    private Integer bedid;

    private String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}