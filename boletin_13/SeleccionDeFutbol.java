
package boletin_13;

/**
 *
 * @author jgarciaodowd
 */
public class SeleccionDeFutbol {
    private int id;
    private String Nombre;
    private String apellido;
    private int Edad;

    /**
     *
     */
    public SeleccionDeFutbol() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     */
    public SeleccionDeFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.Nombre = nombre;
        this.apellido = apellido;
        this.Edad = edad;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return Edad;
    }

    /**
     *
     * @param Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     *
     */
    public void viajar(){
            System.out.println("Viaja la selección");
        
        
    }

    /**
     *
     */
    public void concentrarse(){
        System.out.println("Concentrase  la seleccion");
    }

    @Override
    public String toString() {
        return  " El id es:" + id + ", el nombre es:" + Nombre + ", el apellido es:" + apellido + ", la edad es:" + Edad  ;
    }
    
    
    
    
    
    
    
    
    
    
    
}
