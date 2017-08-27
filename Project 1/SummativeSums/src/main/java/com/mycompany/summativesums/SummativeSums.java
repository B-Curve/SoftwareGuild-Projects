/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.summativesums;

/**
 *
 * @author brandonkervin
 */
public class SummativeSums {
    
    public static int[] getArraySums(int[][] values){
        int addedArrays[] = new int[3];
        int arrayCount = 0;
        for(int[] i : values){
            for(int j = 0 ; j<i.length; j++){
                addedArrays[arrayCount] += i[j];
            }
            arrayCount++;
        }
        return addedArrays;
    }
    
    public static void printArraySums(int[] values){
        for(int i = 0;i<values.length;i++){
            System.out.println("#"+i+" Array sum: "+values[i]);
        }
    }
    
    public static void main(String[] args) {
        int[][] values = new int[][]{
            { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
            { 999, -60, -77, 14, 160, 301 },
            { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
            140, 150, 160, 170, 180, 190, 200, -99 }
        };
        int[] addedValues = getArraySums(values);
        printArraySums(addedValues);
    }
    
}
