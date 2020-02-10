package com.gmail.ptimofejev;

public class Triangle {
	double sideA;
	double sideB;
	double sideC;

	public Triangle() {

	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getArea() {
		double halfPer = (sideA + sideB + sideC) / 2.0;
		double area = Math.sqrt(halfPer * (halfPer - sideA) * (halfPer - sideB) * (halfPer - sideC));
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

}
