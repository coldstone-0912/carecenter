package com.group1.carecenter.entity;

public class Nurse {
    private Integer id;

    private Integer nurseid;

    private String nursename;

    private Integer nurserank;

    private String phonenumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNurseid() {
        return nurseid;
    }

    public void setNurseid(Integer nurseid) {
        this.nurseid = nurseid;
    }

    public String getNursename() {
        return nursename;
    }

    public void setNursename(String nursename) {
        this.nursename = nursename == null ? null : nursename.trim();
    }

    public Integer getNurserank() {
        return nurserank;
    }

    public void setNurserank(Integer nurserank) {
        this.nurserank = nurserank;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }
}