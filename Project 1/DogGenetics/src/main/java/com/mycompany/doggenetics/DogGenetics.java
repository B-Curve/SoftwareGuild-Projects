/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brandonkervin
 */
public class DogGenetics {
    
    public static void getDogGenes(){
        Scanner dog = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String dogName = dog.nextLine();
        String breeds[] = new String[]{
            "St. Bernard",
            "Chihuahua",
            "Pug",
            "Doverman",
            "Golden Retreiver"
        };
        System.out.println(dogName+" is:");
        Random genes = new Random();
        int chancesRemaining = 100; //Percent chance that the dog will be x% of gene when running the loop
        for(int i = 0;i<breeds.length;i++){
            int percentGene = genes.nextInt((chancesRemaining+1));
            System.out.println(percentGene+"% "+breeds[i]);
            chancesRemaining-=percentGene;
        }
        System.out.println(chancesRemaining+"% Pitbull");
    }
    
    public static void main(String[] args) {
        getDogGenes();
    }
    
}
