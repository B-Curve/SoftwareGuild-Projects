/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author brandonkervin
 */
public class HealthyHearts {
    
    public static void getTargetHeartRate(){
        Scanner user = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = user.nextInt();
        int maxHeartRate;
        if(userAge > 155){
            System.out.println("Nobody lives that long, closing program...");
            return;
        }else if(userAge < 1){
            System.out.println("No zeroes or negatives accepted, closing program...");
            return;
        }else{
            maxHeartRate = 220 - userAge;
        }
        System.out.println("Your maximum heart rate should be "+maxHeartRate+".");
        System.out.println("Your target heart rate is "+(int)(maxHeartRate*.5)+" - "+(int)(maxHeartRate*.85)+" beats per minute.");
    }
    
    public static void main(String[] args) {
        getTargetHeartRate();
    }
    
}
