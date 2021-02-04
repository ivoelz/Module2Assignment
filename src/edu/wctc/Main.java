package edu.wctc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create the Player, the Maze, and a Scanner to read keyboard input.
        Player player = new Player();
        Maze maze = new Maze(player);
        Scanner input = new Scanner(System.in);

        // ArrayList's for commands
        ArrayList<Character> directions = new ArrayList<>();
        directions.add('n');
        directions.add('e');
        directions.add('s');
        directions.add('w');
        directions.add('u');
        directions.add('d');

        ArrayList<Character> actions = new ArrayList<>();
        actions.add('i');
        actions.add('l');
        actions.add('x');
        actions.add('v');

        while (!maze.isFinished()) {
            // Print the current room description.
            System.out.println(maze.getCurrentRoomDescription());
            // Print the current room exits.
            System.out.println("The exits are: " + maze.getCurrentRoomExits());
            // Ask the player for a command and read the input as a char.
            // The commands 'n', 's', 'e', 'w', 'u', and 'd' will attempt to move the player in that direction.
            // If the movement is not valid, print a message that says so.
            System.out.println("Enter a command to move through rooms.");
            System.out.println("To move north, enter n. To move east, enter e. To move south, enter s. " +
                    "To move west, enter w. To move up, enter u. To move down, enter d.");

            System.out.println("To interact with this room, enter i");
            System.out.println("To loot this room, enter l");
            System.out.println("To try to exit this room, enter x");
            System.out.println("To see your inventory, enter v");
            char response = input.nextLine().charAt(0);

            if (!actions.contains(response) && !directions.contains(response)) {
                System.out.println("Your response is invalid.");
            } else if (directions.contains(response)) {
                if (maze.move(response)) {
                    System.out.println("You moved to " + maze.getCurrentRoomName());
                } else {
                    System.out.println("You cannot go that way.");
                }
            } else if (response == 'i') {
                System.out.println(maze.interactWithCurrentRoom());
            } else if (response == 'l') {
                System.out.println(maze.lootCurrentRoom());
            } else if (response == 'x') {
                System.out.println(maze.exitCurrentRoom());
            } else if (response == 'v') {
                System.out.println(maze.getPlayerInventory());
            }

            // Print score
            System.out.println("Your score is: " + maze.getPlayerScore());

        }


    }
}
