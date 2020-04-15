package main;

public class Main {
    public static void main(String[] args){
        String modelnumber = "a7dsf7sag7";
        System.out.println(modelnumber);
        modelnumber = "7fdgfdg6fi";

        Room room = new Room("Woonkamer");

        room.addMyTelevision(modelnumber);
        room.addMyTelevision("d8gs6d8sda");

        System.out.println(room.toString());
        System.out.println(room);

        Room room2 = room;
        room = null;

        try{
            System.out.println(room2);
            System.out.println(room);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

    }
}