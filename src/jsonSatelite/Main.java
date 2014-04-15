package jsonSatelite;

import java.util.ArrayList;

import com.google.gson.*;

public class Main 
{
	
	
	public static void main(String[]args)
	{
		
		
		
		
		/*
		estructuras.TextParser tp = new estructuras.TextParser("datos4.txt");
		tp.getOrbits();
		
		
		
		*/
		
		estructuras.TextParser tp = new estructuras.TextParser("datos4.txt");
		
		java.util.List<estructuras.Satelites> tmp = new java.util.ArrayList<estructuras.Satelites>();
			
		tmp.add(new estructuras.Satelites("Uno",tp.getPasses(),tp.getOrbits(),tp.getNameOrbit()));
			
		Gson gson = new Gson();
			
		System.out.println(gson.toJson(tmp));
		
			
			
			
			/*
			
			java.util.List<estructuras.Satelites> tmp = new java.util.ArrayList<estructuras.Satelites>();
			
			tmp.add(new estructuras.Satelites("Uno"));
			
			
			
			
			Gson gson = new Gson();
			
			System.out.println(gson.toJson(tmp));
			*/
			
			
		
	}

}
