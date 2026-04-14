package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your full name: ");
    String fullName = scanner.nextLine();

    System.out.println("What date will you be attending (YYYY-MM-DD)? ");
    String input = scanner.nextLine();
    LocalDate reservationDate = LocalDate.parse(input);

    System.out.println("How many tickets will you need? ");
    String numTickets = scanner.nextLine();


    // "Thank you" + fullName, +  your ticket is set for + reservation date


    if(numTickets.equals("1")) {
        System.out.println("Thank you " + fullName + " your ticket is dated for " + reservationDate);
    }
    else {
        System.out.println("Thank you " + fullName + " your tickets are dated for " + reservationDate);
    }


        System.out.println(reservationDate);
        System.out.println(input);











    }








}
