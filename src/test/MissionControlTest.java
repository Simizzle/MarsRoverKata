package test;

import learnjava.course.MissionControl;
import learnjava.course.MovementInstructionParser;
import learnjava.course.Plateau;
import learnjava.course.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissionControlTest {

    MovementInstructionParser movement = new MovementInstructionParser();
    Plateau plateau = new Plateau(5,5);

    @Test
    void rotateLeftTwice() {
        Rover rover1 = new Rover(3, 2, "N");
        assertEquals("Rover{xCoordinate='3', yCoordinate='2', direction='S'}", movement.moveRover(rover1, "LL", plateau));
    }

    @Test
    void rotateRightTwice() {
        Rover rover1 = new Rover(3, 2, "N");
        assertEquals("Rover{xCoordinate='3', yCoordinate='2', direction='S'}", movement.moveRover(rover1, "RR", plateau));
    }

    @Test
    void moveRoverTwice() {
        Rover rover1 = new Rover(3, 2, "N");
        assertEquals("Rover{xCoordinate='3', yCoordinate='4', direction='N'}", movement.moveRover(rover1, "MM", plateau));
    }

}