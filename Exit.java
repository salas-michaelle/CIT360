package ACP.Handles;

public class Exit implements Handler{
    @Override
    public void handleIt() {
        System.exit(0);
    }
}