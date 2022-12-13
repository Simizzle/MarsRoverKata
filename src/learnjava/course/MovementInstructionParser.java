package learnjava.course;

public class MovementInstructionParser {
    public static String moveRover(Rover rover, String movement, Plateau plateau) {
        for (int i = 0; i < movement.length(); i++) {
            String move = String.valueOf(movement.charAt(i));
            if (move.equals("L")) {
                rover.rotateLeft(rover);
            }
            if (move.equals("R")) {
                rover.rotateRight(rover);
            }
            if (move.equals("M") && ((rover.getxCoordinate() <= plateau.x())
                    && (rover.getyCoordinate() <= plateau.y()))) {
                rover.move(rover, plateau);
            }
        }
        return rover.toString();
    }
}
