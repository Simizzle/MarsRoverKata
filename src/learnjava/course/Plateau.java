package learnjava.course;

public record Plateau(int x, int y) {

    @Override
    public String toString() {
        return "Plateau " +
                "x=" + x +
                ", y=" + y;
    }
}


