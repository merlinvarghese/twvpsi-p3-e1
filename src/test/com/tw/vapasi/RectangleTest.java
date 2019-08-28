package com.tw.vapasi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class RectangleTest {

    @Test
    void checkAreaForInputLen10andWid20(){
        Rectangle rectangle = new Rectangle(10, 20);
        Assertions.assertEquals(200, rectangle.computeArea());
    }
    @Test
    void checkAreaForInputLen10pt5andWid20pt5(){
        Rectangle rectangle = new Rectangle(20.5d, 30.5d);
        Assertions.assertEquals(625.25d, rectangle.computeArea());
    }
}