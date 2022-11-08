package EJERCICIO_8_1;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Nodo {
    
    int dato;
    Nodo enlace;
    
    public Nodo(int x) {
        dato = x;
        enlace = null;
    }
    public int getDato() {
        return dato;
    }
    public Nodo getEnlace() {
        return enlace;
    }
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
