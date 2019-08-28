package com.tw.vapasi;

//Enclosed figure with 4 sides at right angles
class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return (2 * (length + width));//changed names of methods and added perime
    }
}
