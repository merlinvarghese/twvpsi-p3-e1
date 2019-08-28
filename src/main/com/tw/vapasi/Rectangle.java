package com.tw.vapasi;
//Enclosed figure with 4 sides at right angles
public class Rectangle {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double computeArea(){
        return length * width;
    }
}
