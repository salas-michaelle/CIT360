package ACP;

import java.util.*;


public class MapExample{
	
	public static void main(String[] args)
	{
		HashMap shoes = new HashMap();
	
		shoes.put("Christian Louboutin Red heels", 5);
		shoes.put("Aldo black leather boots", 7);
		shoes.put("Aldo gold pumps with glitter", 8);
		shoes.put("Aldo leopard print thigh high boots", 7);
		shoes.put("Jimmy Choo yellow pumps", 10);
		shoes.put("Alexander McQueen black stilletos", 9);
		shoes.put("Louis Vuitton printed wedges", 12);
		
		System.out.println("Number of shoes I own: " + shoes.size());
		
	
		for(Object key: shoes.keySet())
			System.out.println(key + " size: " + shoes.get(key));
		System.out.println();
		

	
	}
}

