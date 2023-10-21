package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class EmailCheckerModel {
    public String checkEmail(String email) {
        // Check email format
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)\\.com$")) {
            return "Email must be in the correct format.";
        }
        return "";
    }
}

