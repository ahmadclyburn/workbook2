package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.setSerialNumber();
        phone.setModel();
        phone.setPhoneNumber();
        phone.setCarrier();
        phone.setOwner();
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getOwner());


    }
}
