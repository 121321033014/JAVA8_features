package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        //load the data to datastructure
        //Integer[] numbers = {1, 45, 67, 45, 59,47,8,22,78,2,4,3,5};
        //List<Integer> numbersList = Arrays.asList(numbers);
        List<Integer> numbersList = Arrays.asList(1, 45, 67, 45, 59,47,8,22,78,2,4,3,5);
        //load the data from datastructure to another stream
        List<Integer> evenNumbers = numbersList.stream()
                //need to write the logic  to filter even numbers
                .filter(number->number%2==0)
                //need to write the logic to collect even numbers
                .collect(Collectors.toList());
        System.out.println("even numbers"+"----->"+evenNumbers);

    }
}
