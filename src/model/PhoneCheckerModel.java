/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PhoneCheckerModel {
    public String checkPhone(String phone) {
        // Check if phone is not a number
        if (!phone.matches("\\d+")) {
            return "Phone number must be numbers.";
        }
        // Check if phone doesn't contain 10 numbers
        if (phone.length() != 10) {
            return "Phone number must contain 10 numbers.";
        }
        return "";
    }
}
