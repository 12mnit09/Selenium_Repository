package com.over.loading;

public class DayPoly {
	
	public void employee() {

		System.out.println("Employee Details");
	}
	public void employee(int a) {
		
		System.out.println("Employee id:"+a);
	}
	public void employee(String b) {
		
		System.out.println("Employee name is:"+b);
	}
	public static void main(String[] args) {
		
		DayPoly dp = new DayPoly();
		dp.employee();
		dp.employee(3447);
		dp.employee("Deepak_Prabhu");
	}

}
