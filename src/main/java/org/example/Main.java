package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int getAreaRectangulo(int base, int altura) {
        return base * altura;
    }
    public static void getArray(int n) {
        if( n > 0 ) {
            List<Integer> array = new ArrayList<Integer>();
            for( int i = n; i >= 1; i--) {
                array.add( i );
            }
            
            for( int i = ((int) Math.ceil((double)n / 2)); i <= n; i++) {
                if( i == n )
                    System.out.println( i );
                else
                    System.out.print( i + ",");
            }
            System.out.println("Tam:" + array.size());
        }
        else {
            System.out.println("Tamaño para dimensionar arreglo inválido.");
        }

    }
    public static void mostrarMenu(int opcion) {
        System.out.println("1.	Area de un rectángulo");
        System.out.println("2.	Crear un Arreglo unidimensional con la dimensión n ");
        System.out.println("3.Salir");
        System.out.println("Eligió la opción: " + opcion);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        List <Integer> arregloOpciones = new ArrayList<Integer>(Arrays.asList( 1,2,5,2,1,2,90,7,3 ));
        int indice = 0;
        int opcion;
        do {
            opcion = arregloOpciones.get( indice );
            mostrarMenu( opcion );
            switch( opcion ) {
                case 1:
                    int base = arregloOpciones.get( ++ indice );
                    System.out.println("La base es: " +  base);
                    int altura = arregloOpciones.get( ++ indice );
                    System.out.println("La altura es: " +  altura );
                    System.out.println("El área del rectángulo es: " + getAreaRectangulo( base, altura));
                    indice++;
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingresa el tamaño del arreglo");
                    int n = arregloOpciones.get( ++indice );
                    getArray(n);
                    indice++;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("No existe la opcion para este valor: " + opcion);
                    indice++;

            }
        }while( opcion != 3 );
    }
}