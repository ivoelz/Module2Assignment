package edu.wctc;

public class Maze {
    // A concrete class that contains a Room field called currentRoom and a Player field called player.
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    // A constructor that accepts a Player object as an argument and assigns it to the field.
    // The Maze constructor creates all of the Room objects in the game and connects them using the Rooms' setter methods.
    // The Room in which the Player begins the game is assigned to the currentRoom field.
    public Maze(Player player) {
        this.player = player;
        Bathroom b = new Bathroom("Bathroom");
        Gym g = new Gym("Gym");
        Vent v = new Vent("Vent");

        this.currentRoom = b;
    }

    // A method named exitCurrentRoom that returns a String
    public String exitCurrentRoom() {
        //If the currentRoom is an Exit, it returns the result of calling exit() on the Room. If not, it returns a message that the current room is not exitable.
        if (this.currentRoom.exit(this.player) != "You cannot exit from this room.") {
            this.isFinished = true;
        }
        return this.currentRoom.exit(this.player);
    }

    // A method named interactWithCurrentRoom that returns a String.
    public String interactWithCurrentRoom() {
        // If the currentRoom is Interactable, it returns the result of calling interact on the Room. If not, it returns a message that no interactions are possible.
        if (currentRoom instanceof Interactable) {
            return ((Interactable) currentRoom).interact(player);
        } else {
            return "This room is not interactable";
        }
    }

    // A method named lootCurrentRoom that returns a String.
    public String lootCurrentRoom() {
        // If the currentRoom is Lootable, it returns the result of calling loot on the Room. If not, it returns a message that the current room is not lootable.
        if (currentRoom instanceof Lootable) {
            return ((Lootable) currentRoom).loot(player);
        } else return "This room is not lootable.";
    }

    // A method named move that accepts a char argument for the direction and returns a boolean.
    public boolean move(char direction) {
        // If the direction is valid to move from within the currentRoom, the adjoining Room becomes the new currentRoom and the method returns true. If not, the method returns false.
        if (this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
    }

    // Methods named getPlayerScore and getPlayerInventory that return the result of calling the Player's getScore and getInventory methods.
    public int getPlayerScore() {
        return this.player.getScore();
    }

    public String getPlayerInventory() {
        return this.player.getInventory();
    }

    // Methods named getCurrentRoomDescription and getCurrentRoomExits that return the result of calling the getDescription and getExits method of the currentRoom.
    public String getCurrentRoomDescription() {
        return this.currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }

    public String getCurrentRoomName() {
        return this.currentRoom.getName();
    }

    // A method named isFinished that returns the Maze's isFinished field (a boolean).
    public boolean isFinished() {
        return this.isFinished;
    }
}
