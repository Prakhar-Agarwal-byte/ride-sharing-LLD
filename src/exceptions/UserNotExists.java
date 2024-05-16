package exceptions;

public class UserNotExistsForVehicle extends IllegalArgumentException{
    public UserNotExistsForVehicle() {
        super("user does not exist for vehicle");
    }
}
