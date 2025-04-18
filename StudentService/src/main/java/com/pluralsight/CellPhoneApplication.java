package com.pluralsight;
import java.util.*;
public class CellPhoneApplication {
    public static void main(String[] args) {
        System.out.println("provide the following information.");

        CellPhone phone = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.println("serial number: ");
        phone.setSerialNumber(input.nextLine());

        System.out.println("model: ");
        phone.setModel(input.nextLine());

        System.out.println("carrier: ");
        phone.setCarrier(input.nextLine());

        System.out.println("phone number: ");
        phone.setPhoneNumber(input.nextLine());

        System.out.println("owner: ");
        phone.setOwner(input.nextLine());


//        phone.setSerialNumber();
//        phone.setModel();
//        phone.setCarrier();
//        phone.setPhoneNumber();
//        phone.setOwner();
        System.out.println("serial numer: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number:" + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());


    }
}
