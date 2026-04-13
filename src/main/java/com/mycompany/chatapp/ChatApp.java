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
    static String Username = "";
    static String Password = "";
    static String Cell = "";
    static String FirstName = "";
    static String LastName = "";
    

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
        FirstName = sc.nextLine();
        
        System.out.print("Enter last name: ");
        LastName = sc.nextLine();
        
        //get username
        System.out.print("Enter username: ");
        Username = sc.nextLine();
        
        if (!Username.contains("_") || Username.length() > 5) {
        System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        return;
         
    }  System.out.println("Username successfully captured.");
    
     //get password
       System.out.print("Enter password: ");
       Password = sc.nextLine();
 
       if (Password.length() < 8 || !Password.matches(".*[A-Z].*") || !Password.matches(".*[0-9].*") || !Password.matches(".*[^a-zA-Z0-9].*")) {
       System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
       return;
      
      }
         
       System.out.println("Password succesfully captured.");
       
       //Get cell number
       System.out.print("Enter cell number (+27XXXXXXXXX): ");
       Cell = sc.nextLine();
       
       if (!Pattern.matches("^\\+27[0-9]{9}$", Cell)) {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            return;
         
     } 
        System.out.println("Cell phone number successfully added.");
        System.out.println("Account successfully created!");
      
         }
         
         static void login() {
             
         System.out.println("Username:"); String u = sc.nextLine();
         System.out.println("Pasword:");  String p = sc.nextLine();
         
         
             
         if (Username.equals(u) && Password.equals(p))
         System.out.println("Welcome " + FirstName + " " + LastName + " it is great to see you.");
          else
         System.out.println("Username or password is incorrect, please try again.");
         }

}


