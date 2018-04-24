package homework9;

public class Fan {
	
	static final int SLOW =1;
	static final int MEDIUM =2;
	static final int FAST =3;
	
	int speed = SLOW;
	boolean on= false;
	double radius= 5;
	String color= "blue";
	
	public void turnON() {
		
		on=true;
		System.out.println("The fan is now turned on.");
	}
	
	public void turnOff() {
		
		on=false;
	}
	
	
	public void increasSpeed() {
		if (speed == SLOW) {
			speed = MEDIUM;
		}
		else if (speed == MEDIUM) {
			speed = FAST;
		}
		else
		System.out.println("Fan is already running at highest speed.");
	}
	
	public void decreaseSpeed() {
		if (speed == FAST) {
			speed = MEDIUM;
		}
		else if (speed == MEDIUM) {
			speed = SLOW;
		}
		else
		System.out.println("Fan is already running at lowest speed.");	
	}
	public void changeSpeed(int speed) {
		if (1<=speed && speed<=3)
			this.speed= speed;
		else
			System.out.println("Incorrect speed value");
	}
	
	public void changeColor(String color) {
		this.color = color;
	}
	
	public void changeRadius(double radius) {
		this.radius = radius;
		System.out.println("The radius has been changed.");
	}
	
	public String toString() {
		if (on==true) {
			return "Speed "+speed+"\nColor "+color+"\nradius "+radius+"\nfan is on";
		}
		else
			return "Speed "+speed+"\nColor "+color+"\nradius "+radius+ "\nfan is off";
	}
	
}
