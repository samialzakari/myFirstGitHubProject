package homework9;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		QuadraticEquation n1= new QuadraticEquation();
		
		System.out.print("Enter a, b, c: ");
		n1.a= in.nextDouble();
		n1.b= in.nextDouble();
		n1.c= in.nextDouble();
		
		if (n1.calcDiscriminant()>=1) { 
			System.out.println("The roots are "+ n1.calcRoot1() +" "+n1.calcRoot2());
			}
		
		else if (n1.calcDiscriminant()==0)
			System.out.println("The root is "+ n1.calcRoot1());
		
		else
			System.out.println("The equation has no roots.");
		
	}

}
