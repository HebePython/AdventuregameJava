package main.Worlds;

public class Zone1 extends World {
    public Zone1() {
        super("Tavern", "A bright roadside tavern full of laughter and patrons.", new String[]{"To Forest", "Downstairs"});
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
