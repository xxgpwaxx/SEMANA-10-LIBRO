package EJERCICIO_8_2;
import java.util.*;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class ListaEnOrden {
    public static void main(String [] a) {
    Random r;
    int d;
    ListaOrdenada list;
    int k;
    r = new Random(); // generador de números aleatorios
    lista = new ListaOrdenada(); // crea lista vacía
    k = r.nextInt(99)+1; // número de elementos
    // inserta elementos en la lista
    for (; k >= 0; k-- ) {
        d = r.nextInt();
        lista.insertaOrden(d);
    }
    // escribe los elementos de la lista
    System.out.println("Elementos de la lista ordenada \n");
    lista.visualizar();
   }
}
