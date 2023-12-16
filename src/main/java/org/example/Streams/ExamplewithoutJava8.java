package org.example.Streams;

public class ExamplewithoutJava8 {
    public static void main(String[] args) {
        int [] numbers={1, 45, 67, 45, 59,47,8,22,78,2,4,3,5};
        int [] evennumbers=new int[numbers.length];
        int evenCount=0;
        for(int number:numbers) {
            if (number % 2 == 0) {
                evennumbers[evenCount] = number;
                evenCount++;
            }
        }
            int[] result=new int[evenCount];
            System.arraycopy(evennumbers,0,result,0,evenCount);

            for(int evennumber:result){
                System.out.println(evennumbers + " ");
            }


    }

}
