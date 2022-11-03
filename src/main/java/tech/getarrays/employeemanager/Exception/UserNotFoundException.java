package tech.getarrays.employeemanager.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String Message) {
        super(Message);
    }
}
