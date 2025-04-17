package com.pluralsight;
import java.util.*;
public class CellPhoneApplication {
    public static void main(String[] args) {
        System.out.println("provide the following information.");

        Scanner input = new Scanner(System.in);

        System.out.println("serial number: ");
        CellPhone.setSerialNumber((input.toString));
        System.out.println("model: ");
        phone.setSerialNumber((input.toString));
        System.out.println("carrier: ");
        phone.setSerialNumber((input.toString));
        System.out.println("phone number: ");
        phone.setSerialNumber((input.toString));
        System.out.println("owner: ");
        phone.setSerialNumber((input.toString));

        CellPhone phone = new CellPhone();

        phone.setSerialNumber((input.toString));
        phone.setModel();
        phone.setCarrier();
        phone.setPhoneNumber();
        phone.setOwner();
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());


    }
}
