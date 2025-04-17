package com.pluralsight;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class AddressApp {
    public static void displayAddress(String street, String city, String state, String zip) {
        StringBuilder address = new StringBuilder();

        address.append(street).append("\n");
        address.append(city).append(state).append(zip);
//        address.append(state);
//        address.append(zip);
        String addressString = address.toString();
        System.out.println(addressString);
    }
    public static void readAndDisplayBillInfo() {
        System.out.println("please provide the information as prompted.");

        Scanner input = new Scanner(System.in);

        System.out.println("Billing Street");
        String billingStreet = input.nextLine();
        System.out.println("Billing City");
        String billingCity = input.nextLine();
        System.out.println("Billing State");
        String billingState = input.nextLine();
        System.out.println("Billing Zip");
        String billingZip = input.nextLine();

        displayAddress(billingStreet, billingCity, billingState,billingZip);
    }

    public static void readAndDisplayShipAddress(){
        System.out.println("please provide shipping address.");

        Scanner input = new Scanner(System.in);

        System.out.println("Shipping Street");
        String shippingStreet = input.nextLine();
        System.out.println("Shipping City");
        String shippingCity = input.nextLine();
        System.out.println("Shipping State");
        String shippingState = input.nextLine();
        System.out.println("Shipping Zip");
        String shippingZip = input.nextLine();

        displayAddress(shippingStreet, shippingCity, shippingState, shippingZip);
    }
        public static void main(String[] args) {
            readAndDisplayBillInfo();
            readAndDisplayShipAddress();
            Scanner input = new Scanner(System.in);

            System.out.println("are you providing shipping or billing address?");
            String billOrShip = input.nextLine();

            if(billOrShip.equals("billing")){
                System.out.println();
            }else if(billOrShip.equals("shipping")){
                System.out.println();
            }else{}

            }
    }


