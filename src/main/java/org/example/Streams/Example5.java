package org.example.Streams;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Example5 {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("Namjoon", 200);
        data.put("jin", 250);
        data.put("yoongi", 355);
        data.put("jungkook", 212);
        data.put("jungheok", 585);
        data.put("jimin", 670);
        data.put("taehyung", 795);
        data.put("bghysk", 753);
        data.put("slow rabbit", 800);
        //Integer[] CreditScore={200,250,212,355,585,670,745,795,753,800};

        List<Integer> numbersList = (List<Integer>) Arrays.asList(data.values().toArray(new Integer[0]));
        List<Integer> high_riskCreditScore = numbersList.stream()
                .filter(numberList1 -> numberList1 <= 350)
                .collect(Collectors.toList());


        System.out.println("the with high risk credit score are" + high_riskCreditScore);

    }
}
               // .filter(CreditScore1->CreditScore1<=350)
                //.collect(Collectors.toList());
        //for(Map.Entry v:data.entrySet()) {
           // System.out.println(v.getKey() + "-------> " + v.getValue());
        //}
        // List<Integer> PoorCreditScore = numbersList.size()
                //.filter(PoorCreditScore2->PoorCreditScore2>350 && PoorCreditScore2<600)
                //.collect(Collectors.toList());
                //List<Integer> GoodCreditScore = numbersList.size()
                //.filter(GoodCreditScore3->GoodCreditScore3>=600)
                //.collect(Collectors.toList());
       //System.out.println("the customers with high risk credit score are"+high_riskCreditScore);
        //System.out.println("the poor credit score are"+PoorCreditScore);
        //System.out.println("the good credit score are"+GoodCreditScore);
