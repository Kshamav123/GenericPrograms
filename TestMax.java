package com.testmaxg;

public class TestMax<T extends Comparable<T>> {
      T firstNo, secondNo, thirdNo;

	public TestMax(T firstNo, T secondNo, T thirdNo) {
	
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.thirdNo = thirdNo;
	}
	/*Generic method using compareTo to find out the maximum of Integers
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
	 /* To print the maximum integer */
	 public static <T> void printMax(T first,T second,T third,T max)
		{
			System.out.printf("Maximum of %s, %s and %s is %s .\n",first,second,third,max);
		}
	 public static void main(String[] args)
		{
			int firstNo=455, secondNo=5543,thirdNo=2189;
			new TestMax(firstNo,secondNo,thirdNo).maximumNo(firstNo,secondNo,thirdNo);
			
		}
}

