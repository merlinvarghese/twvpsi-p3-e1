package com.tw.vapasi;

class Square {
    private double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return side * 4;
    }
}
