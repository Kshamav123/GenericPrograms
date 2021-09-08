package com.testmaxg;

public class TestMax<T extends Comparable<T>>{
	
		
		T firstNo,secondNo,thirdNo;
		
		//Constructor
		public TestMax(T firstNo,T secondNo,T thirdNo) {
			this.firstNo=firstNo;
			this.secondNo=secondNo;
			this.thirdNo=thirdNo;
		}
		
		/*Generic method using compareTo to find out the maximum of Integers
		 * @param max is used to assume first is maximum then compare with second and third
		 * Refactoring: To create Generic Class to take in 3 variables of Generic Type
		 */
		 public static <T extends Comparable<T>> T maximumNo(T firstNo,T secondNo,T thirdNo) {
				T max = firstNo;  
				if(secondNo.compareTo(max)>0) {
					max=secondNo;
				}
				if(thirdNo.compareTo(max)>0) {
					max=thirdNo;
				}
				printMax(firstNo,secondNo,thirdNo,max);
				return max;
			}
		 
		 //Method to print the maximum Value
		 public static <T> void printMax(T firstNo,T secondNo,T thirdNo,T max)
			{
				System.out.printf("Maximum of %s, %s and %s is %s .\n",firstNo,secondNo,thirdNo,max);
			}

	}
