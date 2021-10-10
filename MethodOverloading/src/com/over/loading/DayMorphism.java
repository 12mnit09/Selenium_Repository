package com.over.loading;

public class DayMorphism extends DayPoly {

	@Override
	public void employee() {
		super.employee();
		System.out.println("Company Details");
	
	}
	@Override
	public void employee(int a) {
		super.employee(a);
		System.out.println("Company ID:"+a);
	}
	
	@Override
	public void employee(String b) {
		super.employee(b);
		System.out.println("Company Name:"+b);
	}
	public static void main(String[] args) {
		
		DayMorphism dm= new DayMorphism();
		dm.employee();
		dm.employee(12345);
		dm.employee("iOPEX Technologies");
		
	}
}
