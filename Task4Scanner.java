package com.basic.java;

import java.util.Scanner;

public class Task4Scanner { 
	public static void basicOperation(int X, int Y,int Z) {//ArthimiticOperation
		System.out.println("addition="+X+Y);
		System.out.println("subtraction="+(Y-Z));
		System.out.println("division="+X/Y);
		System.out.println("multiplication="+X*Y);
		System.out.println("modules="+X%Y);
		/*System.out.println("increment"+(++X));
		System.out.println(X>Y);
		System.out.println(X!=Z);*/
	
	}
	public static void main(String[] args) {
		try {
	Scanner user= new Scanner (System.in);// GETTING VALUE THROUGH SCANNERMETHOD
	int X,Y,Z;

	System.out.println("enter the first number:");
	X= user.nextInt();
	System.out.println("enter the Second number:");
	Y= user.nextInt();
	System.out.println("enter the third number:");
	Z= user.nextInt();
	Task4Scanner.basicOperation(X, Y, Z);

		}
		catch(Exception e) {
			System.out.println("invalid input");
		}
	}
}
