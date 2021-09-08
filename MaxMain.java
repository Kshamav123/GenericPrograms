package com.testmaxg;

public class MaxMain {
	public static void main(String args[]) {
		
		
			Integer firstInt=121, secondInt=76,thirdInt=210;
			new TestMax(firstInt,secondInt,thirdInt).maximumNo(firstInt,secondInt,thirdInt);
			
			Float firstFloat=30.7f, secondFloat=31.7f,thirdFloat=23.5f;
			new TestMax(firstFloat,secondFloat,thirdFloat).maximumNo(firstFloat,secondFloat,thirdFloat);
			
			String firstWord= "Watermelon", secondWord= "Peach",thirdWord= "Banana";
			new TestMax(firstWord,secondWord,thirdWord).maximumNo(firstWord,secondWord,thirdWord);
		}

}
