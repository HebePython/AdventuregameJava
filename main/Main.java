package main;

import main.Worlds.World;
import main.Worlds.Zone1;
import main.Worlds.Zone2;
import main.Worlds.Zone3;
import main.Worlds.Zone4;
import main.Worlds.Zone5;

public class Main {

    public static void main(String[] args) {
        World world = new World();

        Zone1 zone1 = new Zone1();
        Zone2 zone2 = new Zone2();
        System.out.println(zone1.getZoneName());
        zone1.displayCurrentZone();
        zone2.displayCurrentZone();
    }
    
}
