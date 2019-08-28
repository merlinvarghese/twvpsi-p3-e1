package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void expectAreaIs100ForSide10() {
        Square square = new Square(10);
        Assertions.assertEquals(100, square.area());
    }
    @Test
    void expectAreaIs6pt25ForSide2pt5() {
        Square square = new Square(2.5);
        Assertions.assertEquals(6.25, square.area());
    }
    @Test
    void expectPerimeterIs8ForSide2() {
        Square square = new Square(2.0);
        Assertions.assertEquals(8, square.perimeter());
    }
    @Test
    void expectPerimeterIs6ForSide1pt5() {
        Square square = new Square(1.5);
        Assertions.assertEquals(6, square.perimeter());
    }
}
