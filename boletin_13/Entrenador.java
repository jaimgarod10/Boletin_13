
package boletin_13;

/**
 *
 * @author jgarciaodowd
 */
public class Entrenador extends SeleccionDeFutbol {
    private String idFederacion;

    /**
     *
     */
    public Entrenador() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param idFederacion
     */
    public Entrenador(int id, String nombre, String apellido, int edad,String idFederacion) {
        super(id,nombre,apellido,edad);
        this.idFederacion = idFederacion;
    }

    /**
     *
     * @return
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     *
     * @param idFederacion
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    /**
     *
     */
    public void dirixirPartido(){
    System.out.println("Tienes que dirigir el partido");    
}    

    /**
     *
     */
    public void dirixirAdestramento(){
        System.out.println("Tienes que dirigir el entrenamiento");
    }

    @Override
    public String toString() {
        return super.toString()+"Entrenador" + "idFederacion=" + idFederacion;
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el entrenador");
    }

  
    }

 
    
    
    
    
    
   
    
    

