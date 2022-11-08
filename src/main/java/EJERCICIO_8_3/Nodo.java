package EJERCICIO_8_3;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Nodo {
    // declaración de nodo de lista doble
    int dato;
    Nodo adelante;
    Nodo atras;
    Nodo enlace;
    
    public int getDato(){
        return dato;
    }
    
    public Nodo(int entrada){
        dato = entrada;
        adelante = atras = null;
    }
}
