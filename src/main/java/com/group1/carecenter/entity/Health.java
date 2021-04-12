package com.group1.carecenter.entity;

import java.util.Date;

public class Health {
    private Integer id;

    private Integer clientid;

    private String bloodglucose;

    private String bloodfat;

    private String bloodpressure;

    private String bloodroutine;

    private String urineroutine;

    private String bmd;

    private String ecg;

    private String eyeground;

    private String liverfunction;

    private String renalfunction;

    private String remark;

    private Date examdate;

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

    public String getBloodglucose() {
        return bloodglucose;
    }

    public void setBloodglucose(String bloodglucose) {
        this.bloodglucose = bloodglucose == null ? null : bloodglucose.trim();
    }

    public String getBloodfat() {
        return bloodfat;
    }

    public void setBloodfat(String bloodfat) {
        this.bloodfat = bloodfat == null ? null : bloodfat.trim();
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure == null ? null : bloodpressure.trim();
    }

    public String getBloodroutine() {
        return bloodroutine;
    }

    public void setBloodroutine(String bloodroutine) {
        this.bloodroutine = bloodroutine == null ? null : bloodroutine.trim();
    }

    public String getUrineroutine() {
        return urineroutine;
    }

    public void setUrineroutine(String urineroutine) {
        this.urineroutine = urineroutine == null ? null : urineroutine.trim();
    }

    public String getBmd() {
        return bmd;
    }

    public void setBmd(String bmd) {
        this.bmd = bmd == null ? null : bmd.trim();
    }

    public String getEcg() {
        return ecg;
    }

    public void setEcg(String ecg) {
        this.ecg = ecg == null ? null : ecg.trim();
    }

    public String getEyeground() {
        return eyeground;
    }

    public void setEyeground(String eyeground) {
        this.eyeground = eyeground == null ? null : eyeground.trim();
    }

    public String getLiverfunction() {
        return liverfunction;
    }

    public void setLiverfunction(String liverfunction) {
        this.liverfunction = liverfunction == null ? null : liverfunction.trim();
    }

    public String getRenalfunction() {
        return renalfunction;
    }

    public void setRenalfunction(String renalfunction) {
        this.renalfunction = renalfunction == null ? null : renalfunction.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getExamdate() {
        return examdate;
    }

    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }
}