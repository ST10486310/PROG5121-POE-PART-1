/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ChatApp {

    static Scanner sc = new Scanner(System.in);
    static String username = "";
    static String password = "";
    static String cell = "";
    static String firstName = "";
    static String lastName = "";

    public static void main(String[] args) {
        System.out.println("=== Welcome to Mzansi Logistics & Technology System ===");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Enter your choice: ");
        String choice = sc.nextLine();

        if (choice.equals("1")) register();
        else if (choice.equals("2")) login();
        else System.out.println("Invalid option.");
    }

    static void register() {
        System.out.print("Enter first name: "); firstName = sc.nextLine();
        System.out.print("Enter last name: ");  lastName = sc.nextLine();
        System.out.print("Enter username: ");   username = sc.nextLine();

        if (!username.contains("_") || username.length() > 5) {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
            return;
        }
        System.out.println("Username successfully captured.");

        System.out.print("Enter password: "); password = sc.nextLine();

        if (password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*[0-9].*") || !password.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            return;
        }
        System.out.println("Password successfully captured.");

        System.out.print("Enter cell number (+27XXXXXXXXX): "); cell = sc.nextLine();

        if (!Pattern.matches("^\\+27[0-9]{9}$", cell)) {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            return;
        }
        System.out.println("Cell phone number successfully added.");
        System.out.println("Account successfully created!");
    }

    static void login() {
        System.out.print("Enter username: "); String u = sc.nextLine();
        System.out.print("Enter password: "); String p = sc.nextLine();

        if (username.equals(u) && password.equals(p))
            System.out.println("Welcome " + firstName + " " + lastName + " it is great to see you.");
        else
            System.out.println("Username or password is incorrect, please try again.");
    }
}