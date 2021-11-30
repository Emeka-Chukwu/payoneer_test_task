package com.example.payoneer_task.model;

public class Identification {
    private String longID;
    private String shortID;
    private String transactionID;

    public String getLongID() { return longID; }
    public void setLongID(String value) { this.longID = value; }

    public String getShortID() { return shortID; }
    public void setShortID(String value) { this.shortID = value; }

    public String getTransactionID() { return transactionID; }
    public void setTransactionID(String value) { this.transactionID = value; }
}
