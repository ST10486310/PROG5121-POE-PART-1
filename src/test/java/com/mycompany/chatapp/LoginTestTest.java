/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class LoginTestTest {
    
    public LoginTestTest() {
    }

    //create test user using test data
    Login user = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

    @Test
    public void testUsernameCorrect() {
        assertEquals("Welcome Kyle Smith it is great to see you.", user.returnLoginStatus("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testUsernameIncorrect() {
        Login badUser = new Login("kyle!!!!!!", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.", badUser.registerUser());
    }

    @Test
    public void testPasswordCorrect() {
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testPasswordIncorrect() {
        Login badUser = new Login("kyl_1", "password", "+27838968976", "Kyle", "Smith");
        assertFalse(badUser.checkPasswordComplexity());
    }

    @Test
    public void testCellCorrect() {
        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testCellIncorrect() {
        Login badUser = new Login("kyl_1", "Ch&&sec@ke99!", "08966553", "Kyle", "Smith");
        assertFalse(badUser.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccessful() {
        assertTrue(user.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFailed() {
        assertFalse(user.loginUser("wrongUser", "wrongPass"));
    }
}
    

