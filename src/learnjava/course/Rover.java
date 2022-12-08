package learnjava.course;

public class Rover implements LunarVehicle {

    private int xCoordinate;
    private int yCoordinate;
    private String direction;


    public Rover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }


    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "xCoordinate='" + xCoordinate + '\'' +
                ", yCoordinate='" + yCoordinate + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }

    @Override
    public String rotateLeft(Rover rover) {
        switch (rover.getDirection()) {
            case "N" -> rover.setDirection("W");
            case "W" -> rover.setDirection("S");
            case "S" -> rover.setDirection("E");
            case "E" -> rover.setDirection("N");
            default -> throw new RuntimeException("Program Error!");
        }
        return rover.getDirection();
    }

    @Override
    public String rotateRight(Rover rover) {
        switch (rover.getDirection()) {
            case "N" -> rover.setDirection("E");
            case "E" -> rover.setDirection("S");
            case "S" -> rover.setDirection("W");
            case "W" -> rover.setDirection("N");
            default -> throw new RuntimeException("Program Error!");
        }
        return rover.getDirection();
    }

    @Override
    public String move(Rover rover, Plateau plateau) {
        if (rover.getDirection().equals("N")) {
            if (rover.getyCoordinate() < plateau.getY()) {
                rover.setyCoordinate(rover.yCoordinate += 1);
            }
        }
        if (rover.getDirection().equals("E")) {
            if (rover.getxCoordinate() < plateau.getX()) {
                rover.setxCoordinate(rover.xCoordinate += 1);
            }
        }
        if (rover.getDirection().equals("S")) {
            if (rover.getyCoordinate() < plateau.getY()) {
                rover.setyCoordinate(rover.yCoordinate -= 1);
            }
        }
        if (rover.getDirection().equals("W")) {
            if (rover.getxCoordinate() < plateau.getX()) {
                rover.setxCoordinate(rover.xCoordinate -= 1);
            }
        } else if ((rover.getxCoordinate() == plateau.getX()) || rover.getyCoordinate() == plateau.getY()){
            System.out.println("Unable to move rover past the plateau boundaries!!!");
        }
        return rover.toString();
    }
}
