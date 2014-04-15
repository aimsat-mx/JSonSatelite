package estructuras;


public class TextParser 
{
	
	private java.util.ArrayList<String>lista;
	
	java.util.ArrayList<String>orbitName;
	
	private String path;
	
	private java.io.File archivo;
	private java.io.FileReader fr;
	private java.io.BufferedReader br;
	
	
	public TextParser(String path)
	{
		this.path = path;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String[][] getPasses()
	{
		String[][] rowParse = null;
		try
		{
			archivo = new java.io.File(path);
			
			fr = new java.io.FileReader (archivo);
	        br = new java.io.BufferedReader(fr);
			
	        lista = new java.util.ArrayList<String>();
	        
			String lineas;
			
			/*
			 * Lectura de las lineas del archivo de Texto
			 */
			while((lineas = br.readLine())!=null)
			{
				
				lista.add(lineas);
			}
			
			java.util.ArrayList<String>passes = new java.util.ArrayList<String>();
			
			
			int k = 0;
			for(int i=0;i<lista.size();i++)
			{
				if(lista.get(i).indexOf("AOS")!=-1)
				{
					k = i+2;
				}
			}
			
			while(k<lista.size())
			{
				if(lista.get(k).indexOf("Orbit")!=-1)
				{
					break;
				}
				passes.add(lista.get(k));
				k++;
			}
			
			int cont = 0;
			String [] row = null;
			
			
				
			row = passes.get(0).split(" ");
			
			
			cont = 0;
			for(int j=0;j<row.length;j++)
			{
				if(!row[j].equals(""))
				{
					cont++;
				}
			}
			
			
			
			
			rowParse = new String[passes.size()][cont];
			
			for(int i=0;i<passes.size();i++)
			{
				row = passes.get(i).split(" ");
				cont = 0;
				for(int m=0;m<row.length;m++)
				{
					if(row[m].equals(""))
					{
						
					}
					else
					{
						rowParse[i][cont] = row[m]; 
						cont++;
					}
				}
				
			}
			
			
		}
		catch(java.io.IOException e)
		{
			
		}
		
		return rowParse;
	}
	
	
	
	public String[][] getOrbits()
	{
		String[][] rowOrbit = null;
		
		
		try
		{
			archivo = new java.io.File(path);
			
			fr = new java.io.FileReader (archivo);
	        br = new java.io.BufferedReader(fr);
			
	        lista = new java.util.ArrayList<String>();
	        
			String lineas;
			
			/*
			 * Lectura de las lineas del archivo de Texto
			 */
			while((lineas = br.readLine())!=null)
			{
				
				lista.add(lineas);
			}
			
			java.util.ArrayList<String>orbit = new java.util.ArrayList<String>();
			orbitName = new java.util.ArrayList<String>();
			
			
			int k = 0;
			for(int i=0;i<lista.size();i++)
			{
				if(lista.get(i).indexOf("AOS")!=-1)
				{
					k = i+2;
				}
			}
			
			for(int i=k;i<lista.size();i++)
			{
				if(lista.get(i).indexOf("Orbit")!=-1)
				{
					k=i;
					break;
				}
			}
			
			
			for(int i=k;i<lista.size();i++)
			{
				if(lista.get(i).indexOf("--")!=-1 || lista.get(i).indexOf("Time")!=-1)
				{
					
				}
				else
				{
					if(lista.get(i).indexOf("Orbit")!=-1)
					{
						orbitName.add(lista.get(i));
					}
					else
					{
						if(lista.get(i).equals(""))
						{
							orbit.add("-");
						}
						else
						orbit.add(lista.get(i));
					}
				}
			}
			
			
			java.util.ArrayList<Integer> nRowsOrbit = new java.util.ArrayList<Integer>();
			int cont = 0;
			for(int i=0;i<orbit.size();i++)
			{
				if(orbit.get(i).equals("-"))
				{
					nRowsOrbit.add(cont);
					cont++;
				}
				else
				cont++;
				
			}
			
			
			java.util.ArrayList<String> individualOrbit = new java.util.ArrayList<String>();
			
			
			String[][][] orbit3D;
			
			orbit3D = new String[nRowsOrbit.size()][][];
			
			for(int i=0;i<nRowsOrbit.size();i++)
			{
				orbit3D[i] = new String[nRowsOrbit.get(i)][];
				for(int j=0;j<nRowsOrbit.get(i);j++)
				{
					orbit3D[i][j] = new String[6];
				}
			}
			
			for(int i = 0;i<orbit.size();i++)
			{
				if(!orbit.get(i).equals("-"))
				{
					individualOrbit.add(orbit.get(i));
				}
			}
			
			rowOrbit = decomposeRows(individualOrbit);
			
			

			
			
		}
		catch(java.io.IOException e)
		{
			
		}
		
		return rowOrbit;
	}
	
	
	public java.util.ArrayList<String> getNameOrbit()
	{
		return orbitName;
	}
	
	
	
	private String[][] decomposeRows(java.util.ArrayList<String> lista)
	{
		String[][] rowsOrbit = null;
		
		String[] row = lista.get(0).split(" ");
		
		int cont = 0;
		for(int j=0;j<row.length;j++)
		{
			if(!row[j].equals(""))
			{
				cont++;
			}
		}
		
		
		rowsOrbit = new String[lista.size()][cont];
		
		
		for(int i=0;i<lista.size();i++)
		{
			row = lista.get(i).split(" ");
			cont = 0;
			for(int m=0;m<row.length;m++)
			{
				if(row[m].equals(""))
				{
					
				}
				else
				{
					rowsOrbit[i][cont] = row[m];
					cont++;
				}

			}
			
		}
		
		/*
		for(int i=0;i<rowsOrbit.length;i++)
		{
			for(int k=0;k<rowsOrbit[0].length;k++)
			{
				System.out.println(rowsOrbit[i][k]);
			}
			System.out.println("");
		}
		*/
		
		return rowsOrbit;
		
	}
	
	
	
	

}
