import java.util.*;
public class Area{
	public static void calculateArea(int length, int width) { 
	    	int area = length * width; //length and breadth are method parameters having method scope.
		System.out.println("Area: " + area); //area is local scope variable
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		calculateArea(l,b);
	}
}
