package ACP;

import java.util.*;
import ACP.Handles.Add;
import ACP.ApplicationController;
import ACP.Handles.ApplicationStart;
import ACP.Handles.Divide;
import ACP.Handles.Error;
import ACP.Handles.Exit;
import ACP.Handles.Multiply;
import ACP.Handles.Subtract;


public class App {
    
    public static void main(String[] args) {
        
        ApplicationController app = new ApplicationController();        
        
        app.mapOption("Main Interface", new ApplicationStart());
        app.mapOption("1", new Add());
        app.mapOption("2", new Subtract());
        app.mapOption("3", new Multiply());
        app.mapOption("4", new Divide());
        app.mapOption("5", new Exit());
        app.mapOption("Operation not valid", new Error());
        
        initiate(app);
    }

    private static void initiate(ApplicationController app) {
        app.handleRequest("Main Interface");
        
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        String option = in.nextLine();

        if (app.opMap.containsKey(option)==true) {
            app.handleRequest(option);
        } else {
            app.handleRequest("Invalid");
        }
        
        initiate(app);
    }
   
}