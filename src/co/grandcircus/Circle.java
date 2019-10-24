package co.grandcircus;

public class Circle {
	
	double radius;
	// circumference = 2 * pi * radius
	// area = pi * radius^2
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
	}
	
	public String getFormattedCircumference() {
		return String.format("Circumference: %s", formatNumber(getCircumference()));
	}
	
	public String getFormmatedArea() {
		return String.format("Area: %s", formatNumber(getArea()));
	}
}
