package ACP;

import ACP.Handles.Handler;
import java.util.HashMap;

public class ApplicationController {
	
	HashMap<String,Handler> opMap = new HashMap<String,Handler>();

    public void handleRequest(String option){
        Handler myOption = opMap.get(option);
        if (myOption != null){
        	myOption.handleIt();
        }
    }

    public void mapOption(String newOption, Handler newHandler){
        opMap.put(newOption, newHandler);
    }
}