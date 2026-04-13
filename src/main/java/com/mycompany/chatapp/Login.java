/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;
import java.util.regex.Pattern;
/**
 *
 * @author lab_services_student
 */
public class Login {
    
    String username, password, cell , firstName, lastName;
    
    public Login(String username, String password, String cell, String firstName, String lastName){
        
        this.username = username;
        this.password = password;
        this.cell = cell;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
     public boolean checkUserName() {
     return username.contains("_") && username.length() <= 5;
     
    }
      public boolean checkPasswordComplexity() {
      return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[^a-zA-Z0-9].*");
    
      }
      
      public boolean checkCellPhoneNumber() {
        return Pattern.matches("^\\+27[0-9]{9}$", cell);
    }
      
      public String registerUser() {
        if (!checkUserName()) return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        if (!checkPasswordComplexity()) return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        return "Account successfully created!";
      
    }
      public boolean loginUser(String u, String p) {
      return username.equals(u) && password.equals(p);
      
    }
      public String returnLoginStatus(String u, String p) {
      if (loginUser(u, p)) return "Welcome " + firstName + " " + lastName + " it is great to see you.";
      return "Username or password incorrect, please try again.";
      
   }
          
  }