package com.pluralsight;
import  java.util.*;
public class NameApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = scanner.nextLine();

        System.out.println("Middle initial ");
        String middleInitial = scanner.next();

        System.out.println("What is your last name? ");
        String lastName = scanner.next();

        System.out.println("Do you have a suffix? ");
        String suffix = scanner.next();

        if (suffix.equals("yes")) {
            System.out.println("which suffix suits you? ");
            String suffixGiver = scanner.next();
            System.out.println("Name- " + suffixGiver + ". "+ firstName + " " + middleInitial + " " +lastName);
        }else if (suffix.equals("no")){
                System.out.println("Name- " + firstName + " " + middleInitial + " " +lastName);
            }
        }
    }


