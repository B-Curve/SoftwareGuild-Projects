/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brandonkervin
 */
public class RockPaperScissors {
    
    public static void playRockPaperScissors(){
      boolean again = true;
      for(;;){
        Scanner user = new Scanner(System.in);
        Random opponent = new Random();
        int wins = 0, losses = 0, ties = 0, rounds = 0;
        String[] options = new String[]{"Rock","Paper","Scissors"};
        System.out.println("How many rounds of Rock, Paper, Scissors would you like to play? [1-10]");
        rounds = user.nextInt();
        if(rounds > 10 || rounds < 1){
            System.out.println("Not a valid number of rounds. Program now closing...");
            return;
        }
        for(int i = 0;i<rounds;i++){
            System.out.println("Rock - 1, paper - 2, or scissors - 3?");
            int userChoice = 1; //assigned to 1 because netbeans was being annoying hahaha
            while(true){
                userChoice = user.nextInt();
                if(userChoice > 0 && userChoice < 4){
                    break;
                }else{
                    System.out.println("Not a valid choice, try again.");
                    user.next();
                }
            }
            System.out.println("You rolled "+options[(userChoice - 1)]+".");
            int opponentRoll = opponent.nextInt(3)+1;
            System.out.println("Your opponent rolled "+options[(opponentRoll - 1)]+".");
            if(userChoice == opponentRoll){
                System.out.println("Round draw!");
                ties++;
            }else if((userChoice == 1 && opponentRoll == 3)||(userChoice == 2 && opponentRoll == 1)){
                System.out.println("Round win!");
                wins++;
            }else{
                System.out.println("Round loss!");
                losses++;
            }
        }
        if(losses > wins){
            System.out.println("The computer wins!");
        }else if(wins > losses){
            System.out.println("You've beat the computer!!");
        }else{
            System.out.println("You tied the computer!");
        }
        System.out.println("You ended with a record of "+wins+"-"+losses+"-"+ties);
          System.out.println("Would you like to play another? Y/N");
          String answer = user.next();
          if(answer.equals("n") || answer.equals("N")){
              return;
          }
      }
    }
    
    public static void main(String[] args) {
        playRockPaperScissors();
    }
    
}
