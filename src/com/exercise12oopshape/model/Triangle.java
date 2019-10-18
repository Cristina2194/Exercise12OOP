package com.exercise12oopshape.model;
import java.lang.Math;
public class Triangle extends Shape
{
	//Characteristics
	private double base;
	private double height;
	
	//Constructors
	public Triangle()
	{
	}
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	public double CalculateArea(double base, double height)
	{
		return (base*height)/2;
	}
	public double CalculatePerimetro(double base, double height, double hypotenuse)
	{
		return Math.sqrt(Math.pow(base,  2)+Math.pow(height, 2));
	}
	
	//Getters and Setter
	public double getBase()
	{
		return this.base;
	}
	public void setBase(double base)
	{
		this.base = base;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	
}
