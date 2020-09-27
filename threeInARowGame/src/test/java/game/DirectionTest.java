package game;

import org.example.game.Direction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void of() {
        assertEquals(Direction.UP, Direction.of(-1, 0));
        assertEquals(Direction.DOWN, Direction.of(1, 0));
        assertEquals(Direction.RIGHT, Direction.of(0, 1));
        assertEquals(Direction.LEFT, Direction.of(0, -1));
        assertThrows(IllegalArgumentException.class, () -> Direction.of(1, 1));
    }
}