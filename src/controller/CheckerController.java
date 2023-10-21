/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.DateCheckerModel;
import model.EmailCheckerModel;
import model.PhoneCheckerModel;
import view.CheckerView;

public class CheckerController {

    private CheckerView view;
    private PhoneCheckerModel phoneModel;
    private EmailCheckerModel emailModel;
    private DateCheckerModel dateModel;

    public CheckerController() {
        view = new CheckerView();
        phoneModel = new PhoneCheckerModel();
        emailModel = new EmailCheckerModel();
        dateModel = new DateCheckerModel();
    }

    public void run() {
        System.out.println("====== Validate Progaram ======");
        String phone = view.getInput("Enter phone number: ");
        String phoneError;
        while (!(phoneError = phoneModel.checkPhone(phone)).isEmpty()) {
            System.out.println(phoneError);
            phone = view.getInput("Enter phone number: ");
        }

        String email = view.getInput("Enter email: ");
        while (!emailModel.checkEmail(email).isEmpty()) {
            view.displayMessage("Email is not in the correct format.");
            email = view.getInput("Enter email: ");
        }

        String date = view.getInput("Enter date (dd/MM/yyyy): ");
        while (!dateModel.checkDate(date).isEmpty()) {
            view.displayMessage("Date is not in the correct format.");
            date = view.getInput("Enter date (dd/MM/yyyy): ");
        }

        view.displayMessage("All input values are in the correct format.");
    }
}
