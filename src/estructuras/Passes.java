package estructuras;

public class Passes 
{
    private String name;

    private String AOS_Fecha;
    private String AOS_Hora;

    private String TCA_Fecha;
    private String TCA_Hora;

    private String LOS_Fecha;
    private String LOS_Hora;

    private String Duration;
    private String MaxEl;
    private String AOSAz;
    private String LOZAz;
    private String Orbit;
	
	
    public Passes(String AOS_Fecha,String AOS_Hora,
            String TCA_Fecha,String TCA_Hora,
            String LOS_Fecha,String LOS_Hora,
            String Duration,
            String MaxEl,
            String AOSAz,
            String LOZAz,
            String Orbit)
    {
        this.AOS_Fecha = AOS_Fecha;
        this.AOS_Hora = AOS_Hora;

        this.TCA_Fecha = TCA_Fecha;
        this.TCA_Hora = TCA_Hora;

        this.LOS_Fecha = LOS_Fecha;
        this.LOS_Hora = LOS_Hora;

        this.Duration = Duration;
        this.MaxEl = MaxEl;
        this.AOSAz = AOSAz;
        this.LOZAz = LOZAz;
        this.Orbit = Orbit;


    }
	
	public Passes(String name)
	{
            this.name= name;
	}
	
	

}
