package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class CheckerView {
    private Scanner scanner;

    public CheckerView() {
        scanner = new Scanner(System.in);
    }

    public String getInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}