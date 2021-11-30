package com.example.payoneer_task.model;
public class Applicable {
    private String code;
    private String label;
    private String method;
    private String grouping;
    private String registration;
    private String recurrence;
    private boolean redirect;
    private ApplicableLinks links;
    private boolean selected;
    private InputElement[] inputElements;
    private String operationType;
    private ContractData contractData;

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public String getLabel() { return label; }
    public void setLabel(String value) { this.label = value; }

    public String getMethod() { return method; }
    public void setMethod(String value) { this.method = value; }

    public String getGrouping() { return grouping; }
    public void setGrouping(String value) { this.grouping = value; }

    public String getRegistration() { return registration; }
    public void setRegistration(String value) { this.registration = value; }

    public String getRecurrence() { return recurrence; }
    public void setRecurrence(String value) { this.recurrence = value; }

    public boolean getRedirect() { return redirect; }
    public void setRedirect(boolean value) { this.redirect = value; }

    public ApplicableLinks getLinks() { return links; }
    public void setLinks(ApplicableLinks value) { this.links = value; }

    public boolean getSelected() { return selected; }
    public void setSelected(boolean value) { this.selected = value; }

    public InputElement[] getInputElements() { return inputElements; }
    public void setInputElements(InputElement[] value) { this.inputElements = value; }

    public String getOperationType() { return operationType; }
    public void setOperationType(String value) { this.operationType = value; }

    public ContractData getContractData() { return contractData; }
    public void setContractData(ContractData value) { this.contractData = value; }
}
