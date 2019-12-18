package ACP.Handles;


import java.util.*;

public class Add implements Handler {
    @Override
    public void handleIt() {
        int firstInteger, secondInteger;

        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("Enter a whole number please:");
        firstInteger = in.nextInt();
        System.out.println("Enter another whole number:");
        secondInteger = in.nextInt();

        System.out.println(firstInteger + " + " + secondInteger + " = " + (firstInteger+secondInteger));

    }
}