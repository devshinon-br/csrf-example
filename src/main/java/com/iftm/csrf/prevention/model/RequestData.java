package com.iftm.csrf.prevention.model;

public class RequestData {
    private String data;

    public RequestData() {
    }

    public RequestData(final String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }
}
