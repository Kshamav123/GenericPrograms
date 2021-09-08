package com.testmaxg;

public class TestMax<T extends Comparable<T>>{
	
T firstNo,secondNo,thirdNo,fourthNo,fifthNo;
	
	
	public TestMax(T firstNo,T secondNo,T thirdNo) {
		this.firstNo=firstNo;
		this.secondNo=secondNo;
		this.thirdNo=thirdNo;
	}
	

	public TestMax(T firstNo,T secondNo,T thirdNo,T fourthNo) {
			this.firstNo=firstNo;
			this.secondNo=secondNo;
			this.thirdNo=thirdNo;
			this.fourthNo=fourthNo;
		}
	
	
	public TestMax(T firstNo,T secondNo,T thirdNo,T fourthNo,T fifthNo) {
			this.firstNo=firstNo;
			this.secondNo=secondNo;
			this.thirdNo=thirdNo;
			this.fourthNo=fourthNo;
			
	}
	
	/*Generic method using compareTo to find out the maximum of Integers
	 * @param max is used to assume first is maximum then compare with second and third
	 * and a method to print
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
	 
	 
	 public static <T> void printMax(T firstNo,T secondNo,T thirdNo,T max)
		{
			System.out.printf("Maximum of %s, %s and %s is %s .\n",firstNo,secondNo,thirdNo,max);
		}

	/*Generic method using compareTo to find out the maximum of Integers
		 * @param max is used to assume first is maximum then compare with second, third and fourth
		 * and a method to print
		 */
	public static <T extends Comparable<T>> T maximumNo(T firstNo,T secondNo,T thirdNo,T fourthNo) {
				T max = firstNo;  
				if(secondNo.compareTo(max)>0) {
					max=secondNo;
				}
				if(thirdNo.compareTo(max)>0) {
					max=thirdNo;
				}
				if(fourthNo.compareTo(max)>0) {
					max=fourthNo;
				}
				printMax(firstNo,secondNo,thirdNo,fourthNo,max);
				return max;
			}
	
	
	
		 public static <T> void printMax(T firstNo,T secondNo,T thirdNo,T fourthNo,T max)
				{
					System.out.printf("Maximum of %s, %s, %s and %s is %s .\n",firstNo,secondNo,thirdNo,fourthNo,max);
				}
	
	
	
	 /*Generic method using compareTo to find out the maximum of Integers
	 * @param max is used to assume first is maximum then compare with second, third and fourth
	 * and a method to print
	 */
	public static <T extends Comparable<T>> T maximumNo(T firstNo,T secondNo,T thirdNo,T fourthNo,T fifthNo) {
		T max = firstNo;
		if(secondNo.compareTo(max)>0) {
			max=secondNo;
		}
		if(thirdNo.compareTo(max)>0) {
			max=thirdNo;
		}
		if(fourthNo.compareTo(max)>0) {
			max=fourthNo;
		}
		if(fifthNo.compareTo(max)>0) {
			max=fifthNo;
		}
		printMax(firstNo,secondNo,thirdNo,fourthNo,fifthNo,max);
		return max;
			}
	
		public static <T> void printMax(T firstNo,T secondNo,T thirdNo,T fourthNo,T fifthNo,T max)
				{
					System.out.printf("Maximum of %s, %s, %s, %s and %s is %s .\n",firstNo,secondNo,thirdNo,fourthNo,fifthNo,max);
				}

	}
