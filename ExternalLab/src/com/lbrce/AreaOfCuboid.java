package com.lbrce;

public class AreaOfCuboid {

	public static void main(String[] args) 
	{
		cuboidArea(10,23,38);
	}
	public static void cuboidArea(int length, int height, int width) 
	{
		int area=2*(length*width + width*height + length*height);
		System.out.println("Area of Cuboid:"+area);
	}
}
