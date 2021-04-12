package com.group1.carecenter.entity;

public class Client {
    private Integer id;

    private Integer clientid;

    private String clientname;

    private Integer clientrank;

    private String phonenumber;

    private String emergentnumber;

    private String status;

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

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public Integer getClientrank() {
        return clientrank;
    }

    public void setClientrank(Integer clientrank) {
        this.clientrank = clientrank;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getEmergentnumber() {
        return emergentnumber;
    }

    public void setEmergentnumber(String emergentnumber) {
        this.emergentnumber = emergentnumber == null ? null : emergentnumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}