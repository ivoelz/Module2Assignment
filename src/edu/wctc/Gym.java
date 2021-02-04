package edu.wctc;

public class Gym extends Room implements Interactable {

    public Gym(String name) {
        super(name);
    }
    public String name = "The Gym";

    @Override
    public String getDescription() {
        return "You enter a huge, dark gym. All the doors have metal bars over them.";
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        return null;
    }

    public String interact = "As you are leaving the gym you find a gold coin.";


    @Override
    public String getExits() {
        return "north and east";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if (direction == 'n' || direction == 'e') {
            return true;
        }
        return false;
    }

    @Override
    public String interact(Player player) {
        player.addToInventory("Gold Coin");
        player.addToScore(100);
        return "You try your best to get past the metal bars with a hockey club you find but after awhile you decide to give up.";
    }

    @Override
    public String loot(Player player) {
        return null;
    }
}
