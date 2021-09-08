package com.testmaxg;

public class TestMax{
	
	public static Integer firstNo,secondNo,thirdNo;
	TestMax(Integer firstNo,Integer secondNo,Integer thirdNo ){
		this.firstNo=firstNo;
		this.secondNo=secondNo;
		this.thirdNo=thirdNo;
	}
	
	public static void maxNo() {
		Integer max= firstNo;
		if(secondNo.compareTo(max)>0) {
			
			max=secondNo;
		}
		if(thirdNo.compareTo(max)>0) {
			max=thirdNo;
		}
		
		System.out.println("Maximum of "+firstNo+","+secondNo+" and "+thirdNo+" is " +max);
		
	}
	

	
}