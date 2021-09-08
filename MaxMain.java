package com.testmaxg;

import java.util.Scanner;

public class MaxMain {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of parameters you want (btw 3 - 5): ");
		int option = sc.nextInt();
		
		switch(option)
		{
		case 3: {
			int firstInt=303, secondInt=450,thirdInt=21;
			new TestMax(firstInt,secondInt,thirdInt).maximumNo(firstInt,secondInt,thirdInt);
			double firstFloat=305.75, secondFloat=3000.25,thirdFloat=307.95;
			new TestMax(firstFloat,secondFloat,thirdFloat).maximumNo(firstFloat,secondFloat,thirdFloat);		
			String firstWord= "Anaconda", secondWord= "Peach",thirdWord= "Orange";
			new TestMax(firstWord,secondWord,thirdWord).maximumNo(firstWord,secondWord,thirdWord);
			break;
		}
		case 4: {
			int firstInt=30, secondInt=55,thirdInt=21, fourthInt=45;
			new TestMax(firstInt,secondInt,thirdInt,fourthInt).maximumNo(firstInt,secondInt,thirdInt,fourthInt);
			double firstFloat=300.75, secondFloat=300.25,thirdFloat=300.95, fourthFloat=300.00;
			new TestMax(firstFloat,secondFloat,thirdFloat,fourthFloat).maximumNo(firstFloat,secondFloat,thirdFloat,fourthFloat);		
			String firstWord= "Apple", secondWord= "Strawberry",thirdWord= "Banana", fourthWord="Peach";
			new TestMax(firstWord,secondWord,thirdWord,fourthWord).maximumNo(firstWord,secondWord,thirdWord,fourthWord);
			break;
		}
		case 5: {
			int firstInt=30, secondInt=55,thirdInt=21, fourthInt=45, fifthInt=3;
			new TestMax(firstInt,secondInt,thirdInt,fourthInt,fifthInt).maximumNo(firstInt,secondInt,thirdInt,fourthInt,fifthInt);
			double firstFloat=300.75, secondFloat=300.25,thirdFloat=300.95, fourthFloat=300.00, fifthFloat= 407;
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
