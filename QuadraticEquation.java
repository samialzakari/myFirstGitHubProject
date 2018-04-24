package homework9;

public class QuadraticEquation {
	
	
	double a, b, c;
	
	double calcDiscriminant() {
		
		return (Math.pow(b, 2)-(4*a*c));
	}
	
	double calcRoot1() {
		return (-b+ Math.pow(calcDiscriminant(), 0.5))/ 2*a;
	}
	
	double calcRoot2() {
		return (-b -Math.pow(calcDiscriminant(), 0.5))/ 2*a;
	}
}
