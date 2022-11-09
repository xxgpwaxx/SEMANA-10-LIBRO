/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_8_4;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Nodo {
    
    String dato;
    Nodo enlace;
    
    public Nodo (String entrada) {
        dato = entrada;
        enlace = this; 
    }
}
