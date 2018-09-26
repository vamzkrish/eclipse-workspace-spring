package com.example.demo;

import java.util.Arrays;

public class MyClass {
    public static void findMaxMin(int[] input)
    {
        int small = input[0];
        int large = input[0];
        
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>large)
            {
                large = input[i];
            }
            else if(input[i]<small)
            {
                small = input[i];
            }
        } // end of for loop
        System.out.println("max : "+ large);
        System.out.println("min : "+ small);
    }
    
    public static int[] sortArr(int[] input)
    {
    	Arrays.sort(input);
    	return input;
    }
    
    public static void main(String args[])
    {
        int[] input = new int[]{1,4,2,6,7,4,7};
        findMaxMin(input);
        
        
        int[] sortedArr = sortArr(input);
        for(int i : sortedArr)
        {
        	System.out.print(i+ " ");
        }
    }
}
