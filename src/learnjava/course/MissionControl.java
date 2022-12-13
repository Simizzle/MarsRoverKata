package learnjava.course;

import java.util.Scanner;

public class MissionControl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MovementInstructionParser movementInstructionParser = new MovementInstructionParser();

        System.out.println("Please enter plateau x & y dimensions (e.g, '5 5': )");
        String plateauDimensions = scanner.nextLine();
        String[] xAndYDimensions = plateauDimensions.trim().split(" ");
        int xDimension = Integer.parseInt(xAndYDimensions[0]);
        int yDimension = Integer.parseInt(xAndYDimensions[1]);
        Plateau plateau = new Plateau(xDimension, yDimension);
        System.out.println("You have created a plateau with the following dimensions: " + plateau);

        System.out.println("Please create a new Rover. Enter x & y coordinate and direction (e.g '2 3 N'): ");
        String roverPosition = scanner.nextLine();
        String[] initialPosition = roverPosition.trim().split(" ");
        int xPosition = Integer.parseInt(initialPosition[0]);
        int yPosition = Integer.parseInt(initialPosition[1]);
        String direction = initialPosition[2];

        Rover rover = null;
        if (xPosition <= plateau.x()
                && (yPosition <= plateau.y())) {
            rover = new Rover(xPosition, yPosition, direction);
            System.out.println("Your rover has been created at: " + rover);
        } else {
            System.out.println("Your chosen rover position is beyond the plateau bounds");
        }

        // maybe a switch statement here for options

        System.out.println("Please enter instructions to move the rover (e.g. RMMLLM)");
        String movement = scanner.next();
        MovementInstructionParser.moveRover(rover, movement, plateau);
        System.out.println("Your rover has been moved to: " + rover.toString());
        // check movement instructions are valid

        // check that movement is within plateau boundaries


    }



}
