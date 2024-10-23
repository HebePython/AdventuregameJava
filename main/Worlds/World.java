package main.Worlds;

import main.Slowprint;

public class World {
    public Slowprint slowprint = new Slowprint();
    private final String ZONE_NAME; // name of the zone
    private final String DESCRIPTION; // describes the zone
    private final String[] DIRECTIONS; // gives the directions you can go
    private final String[] EVENTS; // IDK what this is for

    public World(String zoneName, String description, String[] directions, String[] events) {
        this.ZONE_NAME = zoneName;
        this.DESCRIPTION = description;
        this.DIRECTIONS = directions;
        this.EVENTS = new String[]{"Default"};
    }

    public World() {
        this.ZONE_NAME = "Default";
        this.DESCRIPTION = "Default";
        this.DIRECTIONS = new String[]{"Default"};
        this.EVENTS = new String[]{"Default"};
    }
    public String getZoneName() {
        return ZONE_NAME;
    }

    public void slowprint(String text) {
        slowprint.slowPrint(text);
    }

    public void displayCurrentZone() {
        slowprint.slowPrint("You are in the " + ZONE_NAME + "\n" + DESCRIPTION);
        slowprint.slowPrint("You can go: ");
        for (String direction : DIRECTIONS) {
            slowprint.slowPrint(direction);
        }
    }

    public void displayEvents() {
        for (String event : EVENTS) {
            slowprint.slowPrint(event);
        }
    }
}