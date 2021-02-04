package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // int field called score
    private int score;
    // a list of strings called inventory
    ArrayList<String> inventory = new ArrayList<>();

    // method named addToInventory that accepts a string argument and adds it to the players inventory list
    public void addToInventory(String item) {
        inventory.add(item);
    }

    // method named addToScore that accepts an int argument and adds to the players score
    public void addToScore(int points) {
        this.score += points;
    }

    // method named getInventory that returns a string that contains the contents of the players inventory list
    // if empty return a message that says so
    public String getInventory() {
        if (this.inventory.size() == 0) {
            return "Your inventory is empty.";
        } else {
            var inventoryString = String.join(",", this.inventory);
            return "You are carrying: " + inventoryString;
        }
    }

    // method named getScore that returns the players score field(an int)
    public int getScore() {
        return this.score;
    }
}
