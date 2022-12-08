package test;

import learnjava.course.MissionControl;
import learnjava.course.Plateau;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlateauTest {

    Plateau plateau;

    @BeforeEach
    void setUp() {
        plateau = new Plateau(5, 5);
    }

    @Test
    void canCreatePlateau() {
        // Act
        // Assert
        assertEquals("Plateau x=5, y=5", plateau.toString());
    }
}
