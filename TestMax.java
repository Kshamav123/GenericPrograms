package com.testmaxg;

public class TestMax {

	public static Float firstNo, secondNo, thirdNo;

	TestMax() {
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.thirdNo = thirdNo;
	}

	public float maxNo(Float firstNo, Float secondNo, Float thirdNo) {
		Float max = firstNo;
		if (secondNo.compareTo(max) > 0) {

			max = secondNo;
		}
		if (thirdNo.compareTo(max) > 0) {
			max = thirdNo;
		}

		System.out.println("Maximum of " + firstNo + "," + secondNo + " and " + thirdNo + " is " + max);

		return max;
	}

}