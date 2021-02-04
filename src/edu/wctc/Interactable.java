package edu.wctc;

public interface Interactable {
    // Contains one method named interact that takes a Player object as an argument and returns a String.
    // The String will be displayed to the Player after they interact with the Room.
    public String interact(Player player);
}
