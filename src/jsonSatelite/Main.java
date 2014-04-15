package jsonSatelite;


import com.google.gson.*;

public class Main 
{
	
	
	public static void main(String[]args)
	{
            
            try
            {
                
                /*
                estructuras.TextParser tp = new estructuras.TextParser(args[0]);
                tp.getOrbits();

                */
                
                
                estructuras.TextParser tp = new estructuras.TextParser(args[0].toString());
                

                java.util.List<estructuras.Satelites> tmp = new java.util.ArrayList();

                tmp.add(new estructuras.Satelites(args[1].toString(),tp.getPasses(),tp.getOrbits(),tp.getNameOrbit()));

                Gson gson = new Gson();

                System.out.println(gson.toJson(tmp));
                
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Archivo No Valido");
            }





		
	}

}
