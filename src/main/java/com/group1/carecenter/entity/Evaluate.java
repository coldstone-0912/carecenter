package com.group1.carecenter.entity;

public class Evaluate {
    private Integer id;

    private Integer nurseid;

    private Integer clientid;

    private Integer mark;

    private String remark;

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

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}