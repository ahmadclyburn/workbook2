package com.pluralsight;

public class CellPhone {
    private String serialNumber = "";
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";
    public CellPhone() {
//    this.serialNumber = phoneSerial;
//    this.model = phoneModel;
//    this.carrier = phoneCarrier;
//    this.phoneNumber = phonePhoneNumber;
//    this.owner = phoneOwner;
    }
    public String getSerialNumber(){
    return serialNumber ;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCarrier(){
        return carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
}