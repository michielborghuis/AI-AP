package main;

import main.Television;

public class MyTelevision extends Television {
    private String modelnumber;

    public MyTelevision(String m) {
        this.modelnumber = m;
    }
    public String toString(){
        return this.modelnumber;
    }

    @Override
    public String brand(){
        return "Samsung";
    }

    @Override
    public String color(){
        return "Zwart";
    }

    @Override
    public boolean SmartTV(){
    return false;
    }

    @Override
    public int year(){
        return 1999;
    }
}
