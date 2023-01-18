package dmit.model;

public class Rectangle {
    // fields
    private double theLength;
    private double width;

    public double getLength() {
        return theLength;
    }

    public void setLength(double length) {
        this.theLength = length;
    }

    // read a value - get method
    public double getWidth() {
        return width;
    }

    // change a value - set method
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(double theLength, double width) {
        this.theLength = theLength;
        this.width = width;
    }

    public double area() {
        return width * theLength;
    }

    public double perimeter() {
        return 2 * (theLength + width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(theLength,2) + Math.pow(width,2));
    }

    // main method is for console application
    // not needed for a program -- look at the Circle class for example
}
