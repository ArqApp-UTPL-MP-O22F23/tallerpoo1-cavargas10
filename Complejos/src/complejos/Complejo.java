/*
Cree una clase llamada Complejo para realizar operaciones aritméticas con 
números complejos. 
 
Estos números tienen la forma "parteReal + parteImaginaria * i" 
en donde i es √-1

Escriba un programa para probar su clase. 

Use variables de punto flotante para representar los datos private de la clase.

Proporcione un constructor que permita que un objeto de esta clase se inicialice 
al declararse. 

Proporcione un constructor sin argumentos con valores predeterminados, en caso 
de que no se proporcionen inicializadores. 

Proporcione métodos public que realicen las siguientes operaciones:
    a) Sumar dos números Complejo: las partes reales se suman entre sí y las 
    partes imaginarias también.

    b) Restar dos números Complejo: la parte real del operando derecho se resta 
    de la parte real del operando izquierdo, y la parte imaginaria del operando 
    derecho se resta de la parte imaginaria del operando izquierdo.

    c) Imprimir números Complejo en la forma (a, b), en donde a es la parte real
    y b es la imaginaria.
 */
package complejos;

/**
 *
 * @author cavargas10
 */
public class Complejo implements NumComplejosInterface{
    
    private float numReal;
    private float numImaginario;
    
    public Complejo(float real, float imaginario){
        numReal = real;
        numImaginario = imaginario;
    }

    @Override
    public Complejo Suma(Complejo suma) {
        
        float respReales = numReal + suma.numReal;
        float respImaginarios = numImaginario + suma.numImaginario;

        return new Complejo(respReales, respImaginarios);
    }

    @Override
    public Complejo Resta(Complejo resta) {
        float respReales = numReal - resta.numReal;
        float respImaginarios = numImaginario - resta.numImaginario;

        return new Complejo(respReales, respImaginarios);
    }

    @Override
    public String toFloatString() {
        return String.format("(%.2f, %.2fi)", numReal, numImaginario);
    }


    
}
