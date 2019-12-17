package ACP;


import java.util.*;

public class QueueExample {

    public static void main(String[] args)
    {
             
		
            Queue<String> lineOfChildren = new LinkedList<>(Arrays.asList("Mark", "Sarah", "Tyra", "Jade", "Oscar", "Jose", "Alex", "Carlos"));
		
            System.out.println(lineOfChildren);
		
            lineOfChildren.add("Mason"); 
		
            System.out.println(lineOfChildren);
		
            System.out.println("Next child: " + lineOfChildren.element()); 
		
            lineOfChildren.remove(); 
		
            System.out.println("Next child: " + lineOfChildren.element());
		
            System.out.println(lineOfChildren);
		
    }

}
