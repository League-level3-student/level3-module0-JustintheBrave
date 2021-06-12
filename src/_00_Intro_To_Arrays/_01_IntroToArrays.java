package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String idk [] = new String [5];
    	idk [0] = "a";
    	idk [1] = "b";
    	idk [2] = "c";
    	idk [3] = "d";
    	idk [4] = "e";
         // 2. print the third element in the array
    	System.out.println(idk[2]);
        // 3. set the third element to a different value
    	idk [2] = "z";
        // 4. print the third element again
    	System.out.println(idk[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < idk.length; i++) {
			idk [i] = "word";
		}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < idk.length; i++) {
			System.out.println("word");
		}
        // 7. make an array of 50 integers
    	int [] numbers = new int [50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran = new Random();
    	for (int i = 0; i < numbers.length; i++) {
			int rann = ran.nextInt(101)+1;
			numbers [i] = rann;
		}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int first = numbers[0];
    	for (int i = 1; i < numbers.length; i++) {
			if(numbers [i]< first) {
				first = numbers [i];
			}
		}
    	System.out.println(first + "");
        // 10 print the entire array to see if step 8 was correct
    	/*for (int i = 0; i < numbers.length; i++) {
    		System.out.println(numbers[i] + "");
		} */
    	
        // 11. print the largest number in the array.
    	int one = numbers [0];
    	for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]>one) {
				one = numbers [i];
			}
		}
    	System.out.println(one);
        // 12. print only the last element in the array
    	System.out.println(numbers [numbers.length-1] + "");
    }
}
