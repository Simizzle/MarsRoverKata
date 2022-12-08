package learnjava.course;

import java.util.Arrays;
import java.util.Scanner;

public class MissionControl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter plateau x & y dimensions (e.g, '5 5':");
        String plateauDimensions = scanner.nextLine();
        String[] xAndYDimensions = plateauDimensions.trim().split(" ");
        int xDimension = Integer.valueOf(xAndYDimensions[0]);
        int yDimension = Integer.valueOf(xAndYDimensions[1]);
        Plateau plateau = new Plateau(xDimension, yDimension);
        System.out.println("You have created a plateau with the following dimensions: " + plateau);

        System.out.println("Please create a new Rover. Enter x coordinate: ");
        int xPosition = scanner.nextInt();
        System.out.println("Please enter y coordinate: ");
        int yPosition = scanner.nextInt();
        System.out.println("Please enter the direction of the rover (e.g. 'N': ");
        String direction = scanner.next();

        Rover rover = null;
        if (xPosition <= plateau.getX()
                && (yPosition <= plateau.getY())) {
            rover = new Rover(xPosition, yPosition, direction);
            System.out.println("Your rover has been created at: " + rover);
        } else {
            System.out.println("Your chosen rover position is beyond the plateau bounds");
        }

        // maybe a switch statement here for options

        System.out.println("Please enter instructions to move the rover (e.g. RMMLLM)");
        String movement = scanner.next();
        moveRover(rover, movement, plateau);
        System.out.println("Your rover has been moved to: " + rover.toString());
        // check movement instructions are valid
        // check that movement is within plateau boundaries


    }

    public static String moveRover(Rover rover, String movement, Plateau plateau) {
        for (int i = 0; i < movement.length(); i++) {
            String move = String.valueOf(movement.charAt(i));
            if (move.equals("L")) {
                rover.rotateLeft(rover);
            }
            if (move.equals("R")) {
                rover.rotateRight(rover);
            }
            if (move.equals("M") && ((rover.getxCoordinate() <= plateau.getX())
                    && (rover.getyCoordinate() <= plateau.getY()))) {
                rover.move(rover, plateau);
            }
        }
        return rover.toString();
    }
}
