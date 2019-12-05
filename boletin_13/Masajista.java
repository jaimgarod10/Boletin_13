
package boletin_13;

/**
 *
 * @author jgarciaodowd
 */
public class Masajista extends SeleccionDeFutbol{
    private String titulacion;
    private int añosExperiencia;

    /**
     *
     */
    public Masajista() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param titulacion
     * @param añosExperiencia
     */
    public Masajista(int id, String nombre, String apellido, int edad,String titulacion, int añosExperiencia) {
        super(id,nombre,apellido,edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    /**
     *
     * @return
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     *
     * @param titulacion
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     *
     * @return
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     *
     * @param añosExperiencia
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    /**
     *
     */
    public void darMasajes(){
        System.out.println("Tienes que dar masajes");
    }

    @Override
    public String toString() {
        return  super.toString()+ "La titulacion es:" + titulacion + ", los años de experiencia son:" + añosExperiencia ;
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el masajista");
    }
    
    
    
    
    
    
    
    
}
