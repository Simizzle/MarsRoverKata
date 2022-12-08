package learnjava.course;

public class Plateau {

    private final int x;
    private final int y;

    public Plateau(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Plateau " +
                "x=" + x +
                ", y=" + y;
    }
}


