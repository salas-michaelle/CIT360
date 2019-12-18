package ACP.Handles;

public class Error implements Handler {
    @Override
    public void handleIt() {
        System.out.println("Please enter a valid entry");
    }
}