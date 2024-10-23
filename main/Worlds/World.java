package main.Worlds;

import main.Slowprint;

public class World {
    public Slowprint slowprint = new Slowprint();
    private final String ZONE_NAME;
    private final String DESCRIPTION;
    private final String[] DIRECTIONS;

    public World(String zoneName, String description, String[] directions) {
        this.ZONE_NAME = zoneName;
        this.DESCRIPTION = description;
        this.DIRECTIONS = directions;
    }

    public World() {
        this.ZONE_NAME = "Default";
        this.DESCRIPTION = "Default";
        this.DIRECTIONS = new String[]{"Default"};
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

    public class Zone5 extends World {
        public Zone5() {
            super("Cave", "A dark and damp cave filled with bats and echoes", new String[]{"Foward", "Backward"});
        }
    }

}