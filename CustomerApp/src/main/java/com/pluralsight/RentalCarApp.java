package com.pluralsight;

import java.util.Scanner;

public class RentalCarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CarInventory customer = new CarInventory(19898, "toyota camry", "red",19092, 18988);

        String vehiclesInfo[] = {"101121,Ford Explorer,Red,45000,13500",
                "101122,Toyota Camry,Blue,60000,11000",
                "101123,Chevrolet Malibu,Black,50000,9700",
                "101124,Honda Civic,White,70000,7500",
                "101125,Subaru Outback,Green,55000,14500",
                "101126,Jeep Wrangler,Yellow,30000,16000"};

        System.out.println("Which Vehicle are you interested in? \n");
        System.out.println("1 - List all vehicles\n" +
                "2 - Search by make/model\n" +
                "3 - Search by price range\n" +
                "4 - Search by color\n" +
                "5 - Add a vehicle\n" +
                "6 - Quit\n" +
                "Enter your command:");
        String customerInterest = input.nextLine();

        for (int i = 0; i < vehiclesInfo.length; i++) {
//            System.out.println(vehiclesInfo[i]);

        if(customerInterest.equals("1")){
            System.out.println(vehiclesInfo[i]);
        }else if (customerInterest.equals("2")) {
            System.out.println("What make and model are you looking for? ");
            String customerLookingForMake = input.nextLine();
        }else if (customerInterest.equals("3")) {
            System.out.println("What is your price range? ");
            String customerPriceRange = input.nextLine();
        }else if (customerInterest.equals("4")){
            System.out.println("What's your favorite color? ");
            String customerColor = input.nextLine();
        }else if (customerInterest.equals("5")){
            System.out.println("Insert information of vehicle you want to add. ");
            String CustomerAddingInfo = input.nextLine();
        } else if (customerInterest.equals("6")) {
            break;
        }
    }
    }

    }
