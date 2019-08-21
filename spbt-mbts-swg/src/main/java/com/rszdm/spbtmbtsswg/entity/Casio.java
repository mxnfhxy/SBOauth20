package com.rszdm.spbtmbtsswg.entity;

public class Casio {
    private Integer objectid;

    private String price;

    private String date;

    private String sourcesite;

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getSourcesite() {
        return sourcesite;
    }

    public void setSourcesite(String sourcesite) {
        this.sourcesite = sourcesite == null ? null : sourcesite.trim();
    }
}