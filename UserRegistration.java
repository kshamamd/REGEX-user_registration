package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;


public class UserRegistration{

    public void firstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if(result == true)
            System.out.println("First Name is Valid...");
        else
            System.out.println("First Name is not valid...");
    }

    public void lastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last Name: ");
        String lastName = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        if(result == true)
            System.out.println("Last Name is Valid...");
        else
            System.out.println("Lasst Name is not valid...");
    }

    public void email() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String email = sc.next();
        String regex = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if(result == true)
            System.out.println("Email is Valid...");
        else
            System.out.println("Email is not valid...");
    }

    public static void main(String[] args) {
        UserRegistration regex = new UserRegistration();
        regex.firstName();
        regex.lastName();
        regex.email();
    }
}
