package com.pluralsight;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        int[] testScores = {95, 83, 95, 79, 69, 63, 90, 79, 98, 62, 54};

        Arrays.sort(testScores);

        System.out.println("All scores- ");

        for (int i = 0; i < testScores.length; i++) {
            System.out.println(testScores[i]);}

        int lowScore = testScores[0];
        int highScore = testScores[testScores.length -1];

        int sum =0;
        for (int score : testScores){
            sum+= score;}

        float average = sum/testScores.length;


        System.out.println("Highest score: " + highScore);
        System.out.println("Average score: " + average);
        System.out.println("lowest score: " + lowScore);
    }


}