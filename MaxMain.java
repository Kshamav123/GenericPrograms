package com.testmaxg;

import java.util.Scanner;

public class MaxMain {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of parameters u want to find the maximum between 3-5: ");
		int option = sc.nextInt();
		
		switch(option)
		{
		case 3: {
			Integer firstInt=303, secondInt=450,thirdInt=21;
			new TestMax(firstInt,secondInt,thirdInt).maximumNo(firstInt,secondInt,thirdInt);
			Float firstFloat=305.75f, secondFloat=3000.25f,thirdFloat=307.95f;
			new TestMax(firstFloat,secondFloat,thirdFloat).maximumNo(firstFloat,secondFloat,thirdFloat);		
			String firstWord= "Apple", secondWord= "Peach",thirdWord= "Orange";
			new TestMax(firstWord,secondWord,thirdWord).maximumNo(firstWord,secondWord,thirdWord);
			break;
		}
		case 4: {
			Integer firstInt=304, secondInt=525,thirdInt=215, fourthInt=455;
			new TestMax(firstInt,secondInt,thirdInt,fourthInt).maximumNo(firstInt,secondInt,thirdInt,fourthInt);
			Float firstFloat=306.75f, secondFloat=700.25f,thirdFloat=700.95f, fourthFloat=700.00f;
			new TestMax(firstFloat,secondFloat,thirdFloat,fourthFloat).maximumNo(firstFloat,secondFloat,thirdFloat,fourthFloat);		
			String firstWord= "Apple", secondWord= "Strawberry",thirdWord= "Banana", fourthWord="Peach";
			new TestMax(firstWord,secondWord,thirdWord,fourthWord).maximumNo(firstWord,secondWord,thirdWord,fourthWord);
			break;
		}
		case 5: {
			Integer  firstInt=30, secondInt=55,thirdInt=21, fourthInt=45, fifthInt=3;
			new TestMax(firstInt,secondInt,thirdInt,fourthInt,fifthInt).maximumNo(firstInt,secondInt,thirdInt,fourthInt,fifthInt);
			Float firstFloat=500.75f, secondFloat=380.25f,thirdFloat=760.95f, fourthFloat=900.00f, fifthFloat= 409f;
			new TestMax(firstFloat,secondFloat,thirdFloat,fourthFloat,fifthFloat).maximumNo(firstFloat,secondFloat,thirdFloat,fourthFloat,fifthFloat);		
			String firstWord= "Apple", secondWord= "Peach",thirdWord= "Banana", fourthWord="Strawberry", fifthWord = "Pear";
			new TestMax(firstWord,secondWord,thirdWord,fourthWord,fifthWord).maximumNo(firstWord,secondWord,thirdWord,fourthWord,fifthWord);
			break;
		}
		default: System.out.println("Invalid option.");
		}	
		sc.close();
		}

}
