package com.testmaxg;

public class MaxMain {
	public static void main(String args[]) {

		TestMax obj1=new TestMax("Apple", "Peach", "Watermelon");
		obj1.findStringMax();
		TestMax obj2=new TestMax("Watermelon", "Apple", "Banana");
		obj2.findStringMax();;
		TestMax obj3=new TestMax("Orange", "Banana", "Apple");
		obj3.findStringMax();;
	}

}
