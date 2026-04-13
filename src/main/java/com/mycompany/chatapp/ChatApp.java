/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author lab_services_student
 */
public class ChatApp {
    
    static Scanner sc = new Scanner(System.in);
    static String savedUsername = "";
    static String savedPassword = "";
    static String savedCell = "";
    static String savedFirstName = "";
    static String savedLastName = "";
    

    public static void main(String[] args) {
      
        System.out.println("=== Welcome to Mzansi Logistics & Technology System ===");
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("Enter your choice:");
        String choice = sc.nextLine();
        
        if (choice.equals("1")) {
            register();
        } else if (choice.equals("2")) {
            login();
        } else {
            System.out.println("Invalid option.");
        }
           
            
        }
        
         static void register(){
             
        //get first and last name
        System.out.print("Enter first name: ");
        savedFirstName = sc.nextLine();
        
        System.out.print("Enter last name: ");
        savedLastName = sc.nextLine();
        
        //get username
        System.out.print("Enter username: ");
        savedUsername = sc.nextLine();
        
        if (!savedUsername.contains("_") || savedUsername.length() > 5) {
        System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        return;
         
    }  System.out.println("Username successfully captured.");
    
     //get password
       System.out.print("Enter password: ");
       savedPassword = sc.nextLine();
 
       if (savedPassword.length() < 8 || !savedPassword.matches(".*[A-Z].*") || !savedPassword.matches(".*[0-9].*") || !savedPassword.matches(".*[^a-zA-Z0-9].*")) {
       System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
       return;
      
      }
         
       System.out.println("Password succesfully captured.");
       
       //Get cell number
       System.out.print("Enter cell number (+27XXXXXXXXX): ");
       savedCell = sc.nextLine();
       
       if (!Pattern.matches("^\\+27[0-9]{9}$", savedCell)) {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            return;
         
     } 
        System.out.println("Cell phone number successfully added.");
        System.out.println("Account successfully created!");
      
         }
         
         static void Login() {
             
         }
}


