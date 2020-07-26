package com.company;



import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    private Scanner in = new Scanner(System.in);

    public void start(){
       System.out.println("enter you numbers");
	   String str = this.in.nextLine();
       if(str.equalsIgnoreCase("exit"))
        return;

	   int sum = sum(str);
	   System.out.println(sum);
	   this.start();
    }

    public  int sum(String str){
       int[] intsArray = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
       int sum = 0;
       for (int value:intsArray) {
           sum += value;
       }
       return sum;
    }
}