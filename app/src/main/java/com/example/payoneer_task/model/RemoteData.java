package com.example.payoneer_task.model;

public class RemoteData {
    private RemoteDataLinks links;
    private String timestamp;
    private String operation;
    private String resultCode;
    private String resultInfo;
    private ReturnCode returnCode;
    private Interaction status;
    private Interaction interaction;
    private Identification identification;
    private Networks networks;
    private String operationType;
    private Style style;
    private Payment payment;
    private String integrationType;

    public RemoteDataLinks getLinks() { return links; }
    public void setLinks(RemoteDataLinks value) { this.links = value; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String value) { this.timestamp = value; }

    public String getOperation() { return operation; }
    public void setOperation(String value) { this.operation = value; }

    public String getResultCode() { return resultCode; }
    public void setResultCode(String value) { this.resultCode = value; }

    public String getResultInfo() { return resultInfo; }
    public void setResultInfo(String value) { this.resultInfo = value; }

    public ReturnCode getReturnCode() { return returnCode; }
    public void setReturnCode(ReturnCode value) { this.returnCode = value; }

    public Interaction getStatus() { return status; }
    public void setStatus(Interaction value) { this.status = value; }

    public Interaction getInteraction() { return interaction; }
    public void setInteraction(Interaction value) { this.interaction = value; }

    public Identification getIdentification() { return identification; }
    public void setIdentification(Identification value) { this.identification = value; }

    public Networks getNetworks() { return networks; }
    public void setNetworks(Networks value) { this.networks = value; }

    public String getOperationType() { return operationType; }
    public void setOperationType(String value) { this.operationType = value; }

    public Style getStyle() { return style; }
    public void setStyle(Style value) { this.style = value; }

    public Payment getPayment() { return payment; }
    public void setPayment(Payment value) { this.payment = value; }

    public String getIntegrationType() { return integrationType; }
    public void setIntegrationType(String value) { this.integrationType = value; }
}
