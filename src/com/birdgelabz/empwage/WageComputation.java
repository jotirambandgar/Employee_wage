package com.birdgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        final int WAGE_PER_HR = 20;
        final int WORKING_HR = 8;
        int dailyWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == 1){
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HR * WORKING_HR;
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Daily wage of employee " + dailyWage);
    }
}
