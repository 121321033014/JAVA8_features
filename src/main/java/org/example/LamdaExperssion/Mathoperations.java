package org.example.LamdaExperssion;

public class Mathoperations {
    public static void main(String[] args) {
        Calculator add=(a,b,c)->a+b+c;
        int result = add.operate(20,30,60);
        System.out.println(result);
    }
}