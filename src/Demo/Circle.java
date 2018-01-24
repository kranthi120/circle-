package Demo;

public class Circle {
	private float radius;
	private float diameter;
	private double area;
	private double circumference;
	
	
	public Circle(float radius,float diameter, double area, double circumference) {
		this.radius = radius;
		this.diameter=diameter;
		this.area = area;
		this.circumference = circumference;
	}
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getDiameter() {
		return diameter;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	public double getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(float circumference) {
		this.circumference = circumference;
	}
	
//	public void diameter() {
//		diameter= 2 * radius ;
//		System.out.println("diameter of a circle is " +diameter);
//		
//	}
	public void calculateArea() {
		area= 3.14 * radius *radius;
		System.out.println("radius of a circle is " +area);
		
	}
	public void calculatecircumference() {
		circumference= 2 * 3.14 * radius;
		System.out.println("circumference of a circle is " + circumference);
		
	}

}
