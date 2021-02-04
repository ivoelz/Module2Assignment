package edu.wctc;

public class Bathroom extends Room implements Interactable {

    public Bathroom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "It's cold and quiet and water drips from the faucet. The mirrors are broken and the floor is dirty.";
    }

    public String interact = "You enter one of the stalls and find a roll of toilet paper. On the toilet paper it tells you to go south.";

    @Override
    public String interact(Player player) {
        return interact;
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        if (direction == 's') {
            return new Vent("Vent");
        }
        else if (direction == 'w') {
            return new Gym("Gym");
        }
        return null;
    }

    @Override
    public String getExits() {
        return "south";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if (direction == 's') {
            return true;
        }
        return false;
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Toilet Paper With a Hint");
        player.addToScore(200);
        return "Toilet Paper With a Hint";
    }
}
