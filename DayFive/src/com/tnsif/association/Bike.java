package com.tnsif.association;

public class Bike {
	
	private String color;
	private int topSpeed;
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	public void bikeinfo() {
		System.out.println( "color=" + color + ", topSpeed=" + topSpeed );
	}
	
	public static void main(String[] args) {
		
		Bike bmw= new Bike();
		
		bmw.setColor("Black");
		bmw.setTopSpeed(120);
		
		
		bmw.bikeinfo();
		
		BMW b= new BMW();
		b.bmwDemo();
	}
	
	
	

}

class BMW extends Bike {
	 public void bmwDemo() {
		 
		 Engine e=new Engine();
		 
		 e.engine_on();
		 
		 e.engine_kill();
	 }
}

class Engine{
	
	public void engine_on() {
		
		System.out.println("ignition on");
	}
	public void engine_kill() {
		System.out.println("ignition off");
		
	}
}