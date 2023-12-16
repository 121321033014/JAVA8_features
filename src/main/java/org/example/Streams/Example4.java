package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
Integer[] numbers={12,25,83,48,51,6,72,85,92,10};
        List<Integer> numbersList = Arrays.asList(numbers);
        List<Integer> evenNumbers = numbersList.stream()
                .filter(number->number%2==0)
                .collect(Collectors.toList());
        System.out.println("evenNumbers are"+evenNumbers);
        List<Integer> RemainingNumbers = numbersList.stream()
                .filter(number->number%2!=0)
                //.filter(number->evenNumbers.contains(number))
                .collect(Collectors.toList());
        System.out.println("Remaining Numbers are"+RemainingNumbers);
        System.out.println("The number of Remaining numbers are "+RemainingNumbers.size()+" in the list");
    }
}
