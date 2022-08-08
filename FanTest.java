import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FanTest {
    private Fan fan;

    @BeforeEach
    void setUP() {
        fan = new Fan();
    }

    @Test
    public void testSpeedUp() {
        // Test OFF speed
        assertEquals(0, fan.gSpeed());

        // Speed INC to 1
        fan.speedInc();
        assertEquals(1, fan.gSpeed());

        // Speed INC to 2
        fan.speedInc();
        assertEquals(2, fan.gSpeed());

        // Speed INC to 3
        fan.speedInc();
        assertEquals(3, fan.gSpeed());

        // Speed INC to 0
        fan.speedInc();
        assertEquals(0, fan.gSpeed());
    }

    @Test
    public void testReverseDirection() {
        // Test Direction is in Forward direction
        assertEquals(Direction.FORWARD, fan.gDirection());

        // Test Reverse Direction from Forward to Backward direction
        fan.reverseDirection();
        assertEquals(Direction.BACKWARD, fan.gDirection());

        // Test Reverse Direction from Backward to Forward direction
        fan.reverseDirection();
        assertEquals(Direction.FORWARD, fan.gDirection());
    }

    @Test
    public void testSpeedUpAndReverseDirection() {
        // Test Speed is OFF and Fan is facing Forward Direction
        assertEquals(0, fan.gSpeed());
        assertEquals(Direction.FORWARD, fan.gDirection());
        assertNotEquals(Direction.BACKWARD, fan.gDirection());

        // Test Speed is OFF and Fan is facing Backward Direction
        fan.reverseDirection();
        assertEquals(0, fan.gSpeed());
        assertEquals(Direction.BACKWARD, fan.gDirection());
        assertNotEquals(Direction.FORWARD, fan.gDirection());

        // Test Speed is 1 and Fan is facing Backward Direction
        fan.speedInc();
        assertEquals(1, fan.gSpeed());
        assertEquals(Direction.BACKWARD, fan.gDirection());
        assertNotEquals(Direction.FORWARD, fan.gDirection());

        // Test Speed is 1 and Fan is facing Forward Direction
        fan.reverseDirection();
        assertEquals(1, fan.gSpeed());
        assertEquals(Direction.FORWARD, fan.gDirection());
        assertNotEquals(Direction.BACKWARD, fan.gDirection());

        // Test Speed is 2 and Fan is facing Forward Direction
        fan.speedInc();
        assertEquals(2, fan.gSpeed());
        assertEquals(Direction.FORWARD, fan.gDirection());
        assertNotEquals(Direction.BACKWARD, fan.gDirection());

        // Test Speed is 2 and Fan is facing Backward Direction
        fan.reverseDirection();
        assertEquals(2, fan.gSpeed());
        assertEquals(Direction.BACKWARD, fan.gDirection());
        assertNotEquals(Direction.FORWARD, fan.gDirection());

        // Test Speed is 3 and Fan is facing Backward Direction
        fan.speedInc();
        assertEquals(3, fan.gSpeed());
        assertEquals(Direction.BACKWARD, fan.gDirection());
        assertNotEquals(Direction.FORWARD, fan.gDirection());

        // Test Speed is 3 and Fan is facing Forward Direction
        fan.reverseDirection();
        assertEquals(3, fan.gSpeed());
        assertEquals(Direction.FORWARD, fan.gDirection());
        assertNotEquals(Direction.BACKWARD, fan.gDirection());

        // Test Speed is 0 and Fan is facing Forward Direction
        fan.speedInc();
        assertEquals(0, fan.gSpeed());
        assertEquals(Direction.FORWARD, fan.gDirection());
        assertNotEquals(Direction.BACKWARD, fan.gDirection());

        // Test Speed is 0 and Fan is facing Backward Direction
        fan.reverseDirection();
        assertEquals(0, fan.gSpeed());
        assertEquals(Direction.BACKWARD, fan.gDirection());
        assertNotEquals(Direction.FORWARD, fan.gDirection());
    }
}
