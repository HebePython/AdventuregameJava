package main;

import main.Worlds.World;
import main.Worlds.Zone1;

public class Main {

    public static void main(String[] args) {
        World world = new World();

        Zone1 zone1 = new Zone1();
        System.out.println(zone1.getZoneName());
        zone1.displayCurrentZone();
    }
    
}
