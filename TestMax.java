package com.testmaxg;

public class TestMax {
	public static String first,second,third;
	
	public TestMax(String first,String second,String third) {
		this.first=first;
		this.second=second;
		this.third=third;
	
	}
	
	public static void findStringMax() {
		String max=first;
		if(second.compareTo(max)>0) {
			
			max=second;
		}
		if(third.compareTo(max)>0) {
			max=third;
		}
		
		System.out.println("Maximum of "+first+","+second+" and "+third+" is =" +max);
		
	}
}