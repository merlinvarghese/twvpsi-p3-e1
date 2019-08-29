package com.tw.vapasi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
class RectangleTest {
    @Nested
    static class Rectangletest {

        @Test
        void expectAreaIs200ForLength20andWidth10() {
            Rectangle rectangle = Rectangle.createRectangle(20, 10);
            Assertions.assertEquals(200, rectangle.area());
        }

        @Test
        void expectAreaIs625pt25ForLength30pt5andWidth20pt5() {
            Rectangle rectangle = Rectangle.createRectangle(30.5, 20.5);
            Assertions.assertEquals(625.25, rectangle.area());
        }

        @Test
        void expectPerimeterIs102ForLength30pt5andWidth20pt5() {
            Rectangle rectangle = Rectangle.createRectangle(30.5, 20.5);
            Assertions.assertEquals(102, rectangle.perimeter());
        }

        @Test
        void expectPerimeterIs1200ForLength500andWidth100() {
            Rectangle rectangle = Rectangle.createRectangle(500, 100);
            Assertions.assertEquals(1200, rectangle.perimeter());
        }
    }
    @Nested
    static class SquareTest {

        @Test
        void expectAreaIs100ForSide10() {
            Rectangle square = Rectangle.createSquare(10);
            Assertions.assertEquals(100, square.area());
        }
        @Test
        void expectAreaIs6pt25ForSide2pt5() {
            Rectangle square = Rectangle.createSquare(2.5);
            Assertions.assertEquals(6.25, square.area());
        }
        @Test
        void expectPerimeterIs8ForSide2() {
            Rectangle square = Rectangle.createSquare(2.0);
            Assertions.assertEquals(8, square.perimeter());
        }
        @Test
        void expectPerimeterIs6ForSide1pt5() {
            Rectangle square = Rectangle.createSquare(1.5);
            Assertions.assertEquals(6, square.perimeter());
        }
    }

}