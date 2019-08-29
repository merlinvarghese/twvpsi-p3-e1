package com.tw.vapasi;

//Enclosed figure with 4 sides at right angles
class Rectangle {
    private double length;
    private double width;

    private Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    static Rectangle createRectangle(double length, double width) {
        return new Rectangle(length, width);
    }


    static Rectangle createSquare(double side) {
        return new Rectangle(side);
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return (2 * (length + width));
    }
}
