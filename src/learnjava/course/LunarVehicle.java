package learnjava.course;

public interface LunarVehicle {
    public String move(Rover rover, Plateau plateau) throws Exception;
    public String rotateLeft(Rover rover);
    public String rotateRight(Rover rover);

}
