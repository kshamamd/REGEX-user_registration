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
    public void mobileNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number: ");
        String mobileNumber = sc.next();
        String regex = "^[91]+[\s]+[0-9]{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean result = matcher.matches();
        if(result == true)
            System.out.println("Mobile Number is Valid...");
        else
            System.out.println("Mobile Number is not valid...");
    }
    public void passwordEightCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password with minimum 8 Character: ");
        String password = sc.next();
        String regex = "^[a-zA-Z0-9]{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        if(result == true)
            System.out.println("Password is Valid...");
        else
            System.out.println("Password is not valid...");
    }

    public static void main(String[] args) {
        UserRegistration regex = new UserRegistration();
        regex.firstName();
        regex.lastName();
        regex.email();
        regex.mobileNumber();
        regex.passwordEightCharacter();
    }
}
