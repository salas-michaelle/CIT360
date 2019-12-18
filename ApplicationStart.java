package ACP.Handles;


public class ApplicationStart implements Handler {
    @Override
    public void handleIt() {
       System.out.println("Enter the number of the operation you desire:");
       System.out.println("[1] Add");
       System.out.println("[2] Subtract");
       System.out.println("[3] Multiply");
       System.out.println("[4] Divide");
       System.out.println("[5] Exit");
    }
}