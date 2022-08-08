public class Fan {

    private Direction direction = Direction.FORWARD;

    // 0 = OFF
    private int speed = 0;

    /*
     * @param No param input
     * 
     * @return the speed value
     */
    public int gSpeed() {
        return speed;
    }

    /*
     * @param No param input
     * 
     * @return the direction value
     */
    public Direction gDirection() {
        return direction;
    }

    /*
     * There are 3 speed settings such as 0 = off, 1, 2.
     * If the cord is pulled on speed 3, fan returns to OFF which is 0
     */
    public void speedInc() {
        speed = ((speed == 3) ? 0 : speed + 1);
    }

    /*
     * To Reverse the direction of the fan at the current settings.
     * If current direction setting is Forward, when the cord is pulled
     * then the direction setting is Backward
     */
    public void reverseDirection() {
        if (direction == Direction.FORWARD) {
            direction = Direction.BACKWARD;
        } else {
            direction = Direction.FORWARD;
        }
    }

    @Override
    public String toString() {
        return String.format("The fan is currenly at %d speed in %s direction", speed, direction);
    }
}

enum Direction {
    FORWARD,
    BACKWARD,
}
