package com.sbi.loans.homeloans;

public class FirstClass implements SecondClass
	{
		int a=50,b=80,c=0;
		public void multiplication() {
			c=a*b;
			System.out.println("multiplication of a&b are:"+c);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass h=new FirstClass();
		h.multiplication();
		h.division();
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("division override in secondclass");
	}

}
