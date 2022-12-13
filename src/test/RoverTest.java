package test;

import learnjava.course.Plateau;
import learnjava.course.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    Plateau plateau = new Plateau(5, 5);

    @Test
    void canCreateRover() {
        // arrange
        // act
        Rover rover = new Rover(2, 4, "N");

        // assert
        assertEquals("Rover{xCoordinate='2', yCoordinate='4', direction='N'}", rover.toString());
    }

    @Test
    void rotateLeftOnce() {
        Rover rover1 = new Rover(3, 2, "N");
        assertEquals("W", rover1.rotateLeft(rover1));
    }


    @Test
    void rotateRightOnce() {
        Rover rover1 = new Rover(3, 2, "N");
        assertEquals("E", rover1.rotateRight(rover1));
    }


    @Test
    void moveRoverOnce() {
        Rover rover1 = new Rover(3, 2, "N");
        assertEquals("Rover{xCoordinate='3', yCoordinate='3', direction='N'}", rover1.move(rover1, plateau));
    }

}
