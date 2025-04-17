package com.pluralsight;

public class CellPhone {
    private String serialNumber = "1000000";
    private String model = " iPhone X";
    private String carrier = "AT&T";
    private String phoneNumber = "800-555-5555";
    private String owner = "Dana Wyatt";
//    public CellPhone(String serialNumber, String model){
//    this.serialNumber = "";
//    this.model ="";
//    }
    public String getSerialNumber(){
    return serialNumber ;
    }
    public void setSerialNumber() {
    }
    public String getModel() {
        return model;
    }
    public void setModel() {

    }
    public String getCarrier(){
    return carrier;
    }
    public void setCarrier(){

    }
    public String getPhoneNumber(){
    return phoneNumber;
    }
    public void setPhoneNumber(){

    }
    public String getOwner(){
    return owner;
    }
    public void setOwner(){

    }
}
//- serialNumber (ex: 1000000 - 9999999)
//- model (ex: iPhone X)
//- carrier (ex: AT&T)
//- phoneNumber (ex: 800-555-5555)
//- owner (ex: Dana Wyatt