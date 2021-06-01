package com.bekzodkeldiyarov.TrafficLight;

public enum TrafficLight {
    RED(100),
    YELLOW(100),
    GREEN(300);


    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
