package edu.wctc;

public class Vent extends Room implements Interactable {

    public Vent(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "A dark vent in the corner of the bathroom. You enter and the walls start closing in on you so you crawl as fast as you can.";
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        return null;
    }

    public String interact = "As you are quickly crawling through you find a dusty enchanted book.";

    @Override
    public String interact(Player player) {
        return interact;
    }

    @Override
    public String getExits() {
        return "west";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if (direction == 'w') {
            return true;
        }
        return false;
    }

    @Override
    public String exit(Player player) {
        player.addToInventory("Dusty Enchanted Book");
        player.addToScore(500);
        return "As the walls are closing in you see a light at the end of the vent and you quickly slide to escape and return to the outside world.";
    }

    @Override
    public String loot(Player player) {
        return null;
    }
}
