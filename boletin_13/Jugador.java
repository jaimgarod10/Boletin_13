package boletin_13;

/**
 *
 * @author jgarciaodowd
 */
public class Jugador extends SeleccionDeFutbol {
    private int dorsal;
    private String demarcacion;

    /**
     *
     */
    public Jugador() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param dorsal
     * @param demarcacion
     */
    public Jugador(int id, String nombre, String apellido, int edad,int dorsal, String demarcacion) {
        super(id,nombre,apellido,edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    /**
     *
     * @return
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     *
     * @param dorsal
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     *
     * @return
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     *
     * @param demarcacion
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    /**
     *
     */
    public void jugarPartido(){
        System.out.println("Tienes que jugar el partido");
    }

    /**
     *
     */
    public void entrenar(){
        System.out.println("Hay que entrenar");
    }

    @Override
    public String toString() {
        return super.toString()+" El dorsal es:" + dorsal + ", la demarcacion es:" + demarcacion ;
    }

    /**
     *
     */
    @Override
    public void viajar() {
       System.out.println("Viaja el jugador"); 
    }

 
    }
    
  
    
    
    
    
    
    

