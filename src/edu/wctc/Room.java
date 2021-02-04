package edu.wctc;

public abstract class Room implements Lootable, Interactable, Exit {
    // An abstract class that contains a String field called name and six Room fields called north, south, east, west, up, and down.
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    // A constructor that accepts a String for the name of the Room.
    public Room(String name) {
        this.name = name;
    }

    // An abstract method named getDescription that returns a String.
    // The String will be displayed to the Player when they enter the Room and should contain a description of what they see.
    public abstract String getDescription();

    // A method named getAdjoiningRoom that accepts a char argument for the direction.
    //  If this Room is connected to another Room in the given direction, that Room is returned. Otherwise, return null.
    public abstract Room getAdjoiningRoom(char direction);

    // A method named getExits that returns a String.
    public abstract String getExits();

    // A method named getName that returns the name of the Room.
    public String getName() {
        // Returns the name of the room
        return this.name;
    }

    // A method named isValidDirection that accepts a char argument for the direction
    // If this Room is connected to another Room in the given direction, return true. Otherwise, return false.
    public abstract boolean isValidDirection(char direction);

    // Six setter methods -- one for each direction -- that accept a Room object and assign it to the appropriate field.
    public void setDown() {
        this.down = down;
    }

    public void setEast() {
        this.east = east;
    }

    public void setNorth(Gym v) {
        this.north = north;
    }

    public void setSouth(Bathroom b) {
        this.south = south;
    }

    public void setUp() {
        this.up = up;
    }

    public void setWest() {
        this.west = west;
    }


    public String exit(Player player) {
        return "You cannot exit from this room.";
    }


}
