package com.bekzodkeldiyarov.Rectangle;

public class RectangleTest {
    public void start() {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        rectangle.setLength(10);
        rectangle.setWidth(15);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        rectangle.setLength(0);
        rectangle.setWidth(20);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

    }
}
