package com.company;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fern flower decompiler)
//


import java.util.Random;
import java.util.Scanner;

public class TripPlanner {
    public static void main (String[] args) {
        logger.println("Welcome to the vacation planner");
        greeting();
        timeAndBudget();
        timeDifference();
        countryArea();
        logger.println("Have a great trip!");
    }

    public static void greeting(){
        Scanner input = new Scanner(System.in);
        logger.print("What's your name?");
        String name = input.next();
        logger.print("Nice to meet you " + name + ", where are you travelling to?");
        String city = input.next();
        logger.println("Great! " + city + " sounds like a great trip");
    }

    public static void timeAndBudget() {
        Scanner input = new Scanner(System.in);
        logger.print("How many days are you going to spend travelling?");
        String days = input.next();
        int numberDays = Integer.parseInt(days);
        logger.print("How much money, in USD, are you planning to spend on your trip?");
        String money = input.next();
        double numberMoney = Double.parseDouble(money);
        logger.print("What is the three letter currency symbol for your travel destination?");
        String moneyName = input.next();
        logger.print("How many " + moneyName + " are there in 1 USD?");
        String amount = input.next();
        double numberAmount = Double.parseDouble(amount);
        logger.println("If you are travelling for " + numberDays + " days that is the same as " + (numberDays * 24) + " hours or " + (numberDays*24*60) + " minutes or "+(numberDays*24*60*60)+ " seconds");
        logger.println("If you are going to spend " + numberMoney + " USD that means that per day you can spend up to " + numberMoney/numberDays + " USD");
        logger.println("Your total budget in " +moneyName+ " is "+ (numberMoney*numberAmount)+ " " +moneyName + ", which per day is "+((numberMoney*numberAmount)/numberDays)+ " "+moneyName );
    }

    public static void timeDifference() {
        Scanner input = new Scanner(System.in);
        logger.print("What is the time difference, in hours, between your home and your destination?");
        String time = input.next();
        int numberTime = Integer.parseInt(time);
        if(numberTime <=12 && numberTime >=0){
                logger.println("That means that when it is midnight at home it will be "+(numberTime)+" in your travel destination");
                logger.println("and when it is noon at home it will be " +(numberTime + 12) );
            } else {
                logger.println("That means that when it is midnight at home it will be "+(numberTime+24)+" in your travel destination");
                logger.println("and when it is noon at home it will be " +(numberTime + 12));
            }
    }

    public static void countryArea() {
        Scanner input = new Scanner(System.in);
        logger.print("What is the square area of your destination country in km2?");
        String area = input.next();
        int numberArea = Integer.parseInt(area);
        logger.println("In miles2 that is " +(numberArea * 0.386102) );
    }
}