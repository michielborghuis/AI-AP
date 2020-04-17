package main;

import java.util.ArrayList;

public class Room {
    private ArrayList<MyTelevision> televisions = new ArrayList<MyTelevision>();
    private String modelnumber;

    public Room(String modelnumber){
        this.modelnumber = modelnumber;
    }

    public void addMyTelevision(String modelnumber){
        MyTelevision television = new MyTelevision(modelnumber);
        this.televisions.add(television);
    }

    public void addMytelevisionObject(MyTelevision television){
        this.televisions.add(television);
    }
}
