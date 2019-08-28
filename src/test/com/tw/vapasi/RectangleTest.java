package com.tw.vapasi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class RectangleTest {

    @Test
    void expectAreaIs200ForLength20andWidth10(){
        Rectangle rectangle = new Rectangle(20, 10);
        Assertions.assertEquals(200, rectangle.area());
    }
    @Test
    void expectAreaIs625pt25ForLength30pt5andWidth20pt5(){
        Rectangle rectangle = new Rectangle(30.5, 20.5);
        Assertions.assertEquals(625.25, rectangle.area());
    }
    @Test
    void expectPerimeterIs102ForLength30pt5andWidth20pt5(){
        Rectangle rectangle = new Rectangle(30.5, 20.5);
        Assertions.assertEquals(102, rectangle.perimeter());
    }
    @Test
    void expectPerimeterIs1200ForLength500andWidth100(){
        Rectangle rectangle = new Rectangle(500, 100);
        Assertions.assertEquals(1200, rectangle.perimeter());
    }
}