package main;

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

    class Zone1 extends World {
        public Zone1() {
            super("Tavern", "A bright roadside tavern full of laughter and patrons.", new String[]{"To Forest"});
        }

        public void takeRest() {
            slowprint.slowPrint("You take a rest and regain some health.");
            // call a method to regain health from player class or interactions class
        }

        public void openShop() {
            slowprint.slowPrint("You open the shop and see a variety of items for sale.");
            // call a method to open shop from items class?
        }
    }

    class Zone2 extends World {
        public Zone2() {
            super("Forest", "A dark and spooky forest full of life", new String[]{"North", "East", "South", "West"});
        }
    }

    class Zone3 extends World {
        public Zone3() {
            super("Swamp", "A murky swamp filled with insects and dangerous waters", new String[]{"North", "East", "South", "West"});
        }
    }

    class Zone4 extends World {
        public Zone4() {
            super("Tavern basement", "A musty moist marred basement filled with spiderwebs", new String[]{"Up"});
        }
    }

    class Zone5 extends World {
        public Zone5() {
            super("Cave", "A dark and damp cave filled with bats and echoes", new String[]{"Foward", "Backward"});
        }
    }

}