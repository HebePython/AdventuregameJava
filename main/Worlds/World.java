package main.Worlds;

import main.Slowprint;

public class World {
    public Slowprint slowprint = new Slowprint();
    private final String ZONE_NAME; // name of the zone
    private final String DESCRIPTION; // describes the zone
    private final String[] DIRECTIONS; // gives the directions you can go
    private String[] EVENTS; // IDK what this is for
    private String currentZone; // the zone you are currently in (not sure if this is needed)


    public World(String zoneName, String description, String[] directions, String[] events, String currentzone) { //3 constructors, temporary
        this.ZONE_NAME = zoneName;
        this.DESCRIPTION = description;
        this.DIRECTIONS = directions;
        this.EVENTS = events;
        this.currentZone = currentzone;
    }

    public World() {
        this.ZONE_NAME = "Default";
        this.DESCRIPTION = "Default";
        this.DIRECTIONS = new String[]{"Default"};
        this.EVENTS = new String[]{"Default"};
    }

    public World(String zoneName, String description, String[] directions) {
        this.ZONE_NAME = zoneName;
        this.DESCRIPTION = description;
        this.DIRECTIONS = directions;
        this.EVENTS = new String[]{"Default"};
    }

    public void setCurrentZone(String zone) {
        this.currentZone = zone;
    }

    public String getZoneName() {
        return ZONE_NAME;
    }

    public void slowprint(String text) {
        slowprint.slowPrint(text);
    }

    public void travel(String direction) {
        slowprint.slowPrint("You travel " + direction);
        // call a method to change the current zone
    }

    public void displayCurrentZone() {
        slowprint.slowPrint("You are in the " + currentZone + "\n" + DESCRIPTION);
        slowprint.slowPrint("You can go: ");
        for (String direction : DIRECTIONS) {
            slowprint.slowPrint(direction);
        }
    }

    public void displayEvents() { // not sure what this is for
        for (String event : EVENTS) {
            slowprint.slowPrint(event);
        }
    }
}