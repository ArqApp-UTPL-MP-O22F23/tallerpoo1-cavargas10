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

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numReal;
        float numImaginario;

        Complejo primeraEcuacion;
        Complejo segundaEcuacion;
        Complejo respuesta;

        System.out.println("OPERACIONES ARITMETICAS CON NUMEROS COMPLEJOS   ");
        System.out.println("---------------------------------------------   ");
        System.out.print("INGRESE EL VALOR REAL DE LA PRIMERA ECUACION:      ");
        numReal = input.nextFloat();
        System.out.print("INGRESE EL VALOR IMAGINARIO DE LA PRIMERA ECUACION: ");
        numImaginario = input.nextFloat();

        primeraEcuacion = new Complejo(numReal, numImaginario);

        System.out.print("INGRESE EL VALOR REAL DE LA SEGUNDA ECUACION:      ");
        numReal = input.nextFloat();
        System.out.print("INGRESE EL VALOR IMAGINARIO DE LA SEGUNDA ECUACION: ");
        numImaginario = input.nextFloat();

        segundaEcuacion = new Complejo(numReal, numImaginario);

        int eleccion = Menu();
        while (eleccion != 3) {
            switch (eleccion) {
                case 1:
                    respuesta = primeraEcuacion.Suma(segundaEcuacion);
                    System.out.printf("a + b = %s\n",
                            respuesta.toFloatString());
                    break;
                case 2:
                    respuesta = primeraEcuacion.Resta(segundaEcuacion);
                    System.out.printf("a - b = %s\n",
                            respuesta.toFloatString());
                    break;
            }
            eleccion = Menu();
        }

    }

    private static int Menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. SALIR");
        System.out.print("ESCOJA UNA OPCION: ");
        return input.nextInt();
    }

}
