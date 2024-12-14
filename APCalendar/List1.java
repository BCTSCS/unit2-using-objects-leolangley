import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

 

public class List1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();  

       


        numbers.add(1);              

        numbers.add(0, 2);   

       


        int first = numbers.get(0);   

        int last = numbers.get(numbers.size() - 1); 

       


        numbers.remove(numbers.size() - 1);

        numbers.remove(Integer.valueOf(1)); 

        numbers.remove(0);        

 

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);

        nums.add("string");

 

        // Java

        nums.add(4);

        int length =  nums.size();

 

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> subset = numbers.subList(1, 4);  // [2, 3, 4]

    }

}


//Committt