package org.example.Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String sentence="BTS debuted in 2013 under Big Hit Entertainment with the single album 2 Cool 4 Skool. BTS released their first Korean and Japanese-language studio albums, Dark & Wild and Wake Up respectively, in 2014.";
        String[] words=sentence.split("\\s");
        Map<String,Long> wordcount= Arrays.stream(words)
                .map(word->word.replaceAll("[^a-zA-Z]","").toLowerCase())
                        .collect(Collectors.groupingBy(w->w,Collectors.counting()));
                wordcount.forEach((word,count)->System.out.println(word+"---->"+count));

    }
}
