package dmit2015.model;
// this class models a Retangle shape
// @author Louisa
// @version 2023.01.20
public class Rectangle {
    // fields
    // the length of this rectangle
    private double theLength;
    // the width of this rectangle
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

    // compute and return the area of this rectangle
    // @return area of this rectangle
    public double area() {
        return width * theLength;
    }


    // compute and return the area of this rectangle
    // @return perimeter of this rectangle
    public double perimeter() {
        return 2 * (theLength + width);
    }


    // compute and return the area of this rectangle
    // @return diagonal of this rectangle

    public double diagonal() {
        return Math.sqrt(Math.pow(theLength,2) + Math.pow(width,2));
    }

    // main method is for console application
    // not needed for a program -- look at the Circle class for example
}
