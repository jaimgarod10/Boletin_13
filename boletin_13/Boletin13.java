package boletin_13;

/**
 *
 * @author jgarciaodowd
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SeleccionDeFutbol obx=new SeleccionDeFutbol();     
        Jugador obj1=new Jugador(25,"Luis","Perez",20,4,"delantero");
        System.out.println(obj1.toString());
        obj1.concentrarse();
        obj1.viajar();
        obj1.concentrarse();
        Entrenador obj2=new Entrenador(22,"Jaime","García",30,"20");
        System.out.println(obj2.toString());
        obj2.concentrarse();
        obj2.viajar();
        Masajista obj3=new Masajista(34,"Pablo","Alvarez",25,"masajista",15);
        System.out.println(obj3.toString());
        obj3.concentrarse();
        obj3.viajar();
    }
    
}
