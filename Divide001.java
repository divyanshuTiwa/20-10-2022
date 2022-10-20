package com.exceptions.demo.bll;

public class Divide001 {

	public static void main(String[] args) {
		
		System.out.println("Division : "+divide(2,0));
		

	}

	public static int divide(int x, int y) {
		int d=0;
		try {
			d = x/y;
			
		}catch(ArithmeticException ex) {
			System.out.println("Can't divide by zero");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return d;
	}



	}


