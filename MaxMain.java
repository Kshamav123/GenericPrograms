package com.testmaxg;

public class MaxMain {
	public static void main(String args[]) {
		
		Integer firstNo1=40,secondNo1=20,thirdNo1=30;
		TestMax obj=new TestMax(firstNo1,secondNo1,thirdNo1);
		obj.maxNo();
		Integer firstNo2=64,secondNo2=50,thirdNo2=70;
		TestMax obj2=new TestMax(firstNo2,secondNo2,thirdNo2);
		obj.maxNo();
		Integer firstNo3=15,secondNo3=50,thirdNo3=88;
		TestMax obj3=new TestMax(firstNo3,secondNo3,thirdNo3);
		obj3.maxNo();
	}

}
