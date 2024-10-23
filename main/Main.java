package main;

import main.World.Zone1;

public class Main {

    public static void main(String[] args) {
        World world = new World(null, null, args);
        Zone1 zone1 = world.new Zone1();
        zone1.displayCurrentZone();
    }
    
}
