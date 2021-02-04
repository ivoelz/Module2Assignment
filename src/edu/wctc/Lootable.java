package edu.wctc;

public interface Lootable {
    // Contains one method named loot that takes a Player object as an argument and returns a String.
    // The String will be displayed to the Player after they loot the Room.
    public String loot(Player player);
}
