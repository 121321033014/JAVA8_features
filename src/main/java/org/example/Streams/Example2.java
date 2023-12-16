package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 67, 45, 59,47,8,22,78,2,4,3,5);
        //List<Integer> numbers =numbersList.stream().map(number->number*number).collect(Collectors.toList());
        Set<Integer> numbers =numbersList.stream().map(number->number*number).collect(Collectors.toSet());
        System.out.println("numbers"+numbers);
    }
}