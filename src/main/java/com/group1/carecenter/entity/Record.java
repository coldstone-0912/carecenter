package com.group1.carecenter.entity;

import java.util.Date;

public class Record {
    private Integer id;

    private Integer nurseid;

    private Integer clientid;

    private Date starttime;

    private String project;

    private Date endtime;

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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}