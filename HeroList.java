package ACP;


	import java.util.*;

	public class HeroList {
	   public static void main(String args[]) {
	   
		  ArrayList<String> hero = new ArrayList<String>();

		  // Elements added to Array List
		  hero.add("Iron Man");
		  hero.add("SpiderMan");
		  hero.add("Captain America");
		  hero.add("Black Panther");
		  hero.add("AntMan");

		  // Display array list
		  System.out.println("Array:"+hero);

		  //You add elements at the given index like this
		  hero.add(0, "StarLord");
		  hero.add(1, "Black Widow");

		  //You emove elements from array list like this
		  hero.remove("SpiderMan");
		  hero.remove("Black Panther");

	                        // Display new array
		  System.out.println("Current array list is:"+hero);

		  // How to remove element from the given index
		  hero.remove(1);

	                        // Display new array
		  System.out.println("Current array list is:"+hero); 
	   }
	}


