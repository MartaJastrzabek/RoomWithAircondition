package com.homework.roomwithaircondition;

public class RoomTest {
    public static void main(String[] args) {
        Room room = new Room(35, 20, true);
        Room room2 = new Room(20,30, false);

        changeTemp(room);
        System.out.println();
        changeTemp(room2);
        System.out.println();
        changeTemp(room);
        System.out.println();
        changeTemp(room);
        System.out.println();
        changeTemp(room);
        System.out.println();


    }

    public static void changeTemp(Room room){
        if(room.decreaseTemp()){
            System.out.println("Temperature decreased by 1 degree. Room temperature is: " + room.getTemperature());
        } else if(!room.isHasAircondition()) {
            System.out.println("You cannot change room temperature. \nThis room has no aircondition. Room temperature: " + room.getTemperature());
        } else {
            System.out.println("It is too cold. Room temperature is: " + room.getTemperature());
        }
    }
}
