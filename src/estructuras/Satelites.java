package estructuras;


public class Satelites 
{
	
	private java.util.ArrayList<Passes>passes;
	
	
	private java.util.ArrayList<Orbit>orbit;
	
	private String Satelite;
	
	
	
	public Satelites(String Satelite,String[][] passesRow,String[][] orbitRow,java.util.ArrayList<String>orbitName)
	{

		this.Satelite = Satelite;
		
		passes = new java.util.ArrayList<Passes>();
		
		
		orbit = new java.util.ArrayList<Orbit>();
		
		
		/*
		 * Generacion de los passes
		 */
		for(int i=0;i<passesRow[0].length;i++)
		{

			passes.add(new Passes(passesRow[i][0],passesRow[i][1],
					passesRow[i][2],passesRow[i][3],
					passesRow[i][4],passesRow[i][5],
					passesRow[i][6],
					passesRow[i][7],
					passesRow[i][8],
					passesRow[i][9],
					passesRow[i][10]
					));
			
		}
		
		
		for(int i=0;i<orbitRow.length;i++)
		{

			orbit.add(new Orbit(orbitRow[i][0],orbitRow[i][1],
					orbitRow[i][2],
					orbitRow[i][3],
					orbitRow[i][4],
					orbitRow[i][5]
					));
			
		}
		
		
		
		
	}
	
	
	
	
	public void setSat(String Satelite)
	{
		this.Satelite = Satelite;
	}
	
	public String getSatelite()
	{
		return Satelite;
	}
	
	

}
