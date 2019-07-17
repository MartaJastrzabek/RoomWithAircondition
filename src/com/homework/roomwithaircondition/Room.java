package com.homework.roomwithaircondition;

public class Room {
    private double area;
    private int temperature;
    private boolean hasAircondition;

    public Room() {
    }

    public Room(double area, int temperature, boolean hasAircondition) {
        this.area = area;
        this.temperature = temperature;
        this.hasAircondition = hasAircondition;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isHasAircondition() {
        return hasAircondition;
    }

    public void setHasAircondition(boolean hasAircondition) {
        this.hasAircondition = hasAircondition;
    }

    public boolean decreaseTemp(){
        if(temperature<=18 || !hasAircondition){
            return false;
        } else {
            temperature--;
            return true;
        }
    }


}
