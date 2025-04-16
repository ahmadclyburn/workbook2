package com.pluralsight;
import java.util.*;
public class NameParser {
    public static void main(String[] args) {
        System.out.println("whats your full name?");

        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();


        int positionOfFirstSpace = fullName.indexOf(' ');
        int positionOfSecondSpace = fullName.lastIndexOf(' ');
//        int endOfName = fullName.lastIndexOf();

        String firstName = fullName.substring(0, positionOfFirstSpace);
        String middleName = fullName.substring(positionOfFirstSpace, positionOfSecondSpace);
        String lastName = fullName.substring(positionOfSecondSpace +1);


        if (positionOfFirstSpace != positionOfSecondSpace) {
            middleName = fullName.substring(positionOfFirstSpace +1, positionOfSecondSpace);
            lastName = fullName.substring(positionOfSecondSpace +1);
        } else {
            lastName = fullName.substring(positionOfSecondSpace +1);
        }
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
    }




    }

