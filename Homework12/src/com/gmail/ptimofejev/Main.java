package com.gmail.ptimofejev;

public class Main {

	public static void main(String[] args) {
		Triangle tri1 = new Triangle(1.1, 1.3, 1.4);
		Triangle tri2 = new Triangle(4, 5, 6);
		Triangle tri3 = new Triangle(4, 11, 12);
		
		System.out.println(tri1);
		System.out.println(tri2);
		System.out.println(tri3);
		
		System.out.format("Triangle 1 area equals %.3f%n", tri1.getArea());
		System.out.format("Triangle 2 area equals %.3f%n", tri2.getArea());
		System.out.format("Triangle 3 area equals %.3f%n", tri3.getArea());
		
	}

}
