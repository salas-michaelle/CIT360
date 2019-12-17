package ACP;

import java.util.*;

public class SetExample {

  public static void main(String args[])
  { 
     int count[] = {21,23,30,33,29,19};
     Set<Integer> ages = new HashSet<Integer>();
     try{
        for(int i = 0; i<5; i++){
           ages.add(count[i]);
        }
        System.out.println(ages);
  
        TreeSet<Integer> sortedAges = new TreeSet<Integer>(ages);
       
        System.out.println("Sorted list is:"+" "+ sortedAges);
      
        System.out.println("The youngest person is "+(Integer)sortedAges.first());
        
        System.out.println("The oldest person is "+
                        (Integer)sortedAges.last());
     }
     catch(Exception exp){}
  }
}
