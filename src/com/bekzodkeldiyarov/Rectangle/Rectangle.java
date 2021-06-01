package com.bekzodkeldiyarov.Rectangle;

public class Rectangle {
    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Out of range " + width);
        }
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Out of range " + length);
        }
    }
}
