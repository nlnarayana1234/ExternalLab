package com.lbrce;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		circleArea(7);
	}
	public static void circleArea(int radius)
	{
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: "+area);
	}
}
