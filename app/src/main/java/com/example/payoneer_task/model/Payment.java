package com.example.payoneer_task.model;

public class Payment {
    private String reference;
    private long amount;
    private String currency;

    public String getReference() { return reference; }
    public void setReference(String value) { this.reference = value; }

    public long getAmount() { return amount; }
    public void setAmount(long value) { this.amount = value; }

    public String getCurrency() { return currency; }
    public void setCurrency(String value) { this.currency = value; }
}
