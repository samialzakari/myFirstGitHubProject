package homework9;

public class Testfan {

	public static void main(String[] args) {
		
		Fan fan1= new Fan();
		Fan fan2= new Fan();
		
		fan1.changeSpeed(3); fan1.changeRadius(10); fan1.changeColor("yellow");
		fan1.turnON();
		fan1.increasSpeed();
		
		
		fan2.changeSpeed(2); fan2.changeRadius(5); fan2.changeColor("blue");
		fan2.turnON();
		fan2.decreaseSpeed();
		fan2.decreaseSpeed();
		fan2.turnOff();
		System.out.println("------------");
		
		System.out.println( "Fan1:\n"+fan1.toString());
		System.out.println("------------"+ "\nFan2:");
		System.out.println(fan2.toString());
		
		System.out.println(fan1.MEDIUM);
		
	}

}
