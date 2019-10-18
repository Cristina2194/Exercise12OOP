package com.exercise12oopshape.model;

public class Shape implements Shapeable
{

	@Override
	public String Draw() {
		
		return "Figure is being draw";
	}

	@Override
	public String ChangeColor() {
		
		return"Figure is being change its color";
	}

	@Override
	public String Erarse() {
	
		return "Figure is being erarse";
	}

	@Override
	public double CalculateArea() {
		
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
