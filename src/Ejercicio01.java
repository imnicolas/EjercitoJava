import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

    public static int buscarLetra(String palabra, char letra) {
        int contador = 0;
        // recorrer el string en busca de una letra
        for (int i = 0; i < palabra.length(); i++) {
            // en cada iteracion voy a guardar en mi contador cada vez que se repita 1 caracter
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

//    Dados 3 números y un orden (ascendente o decreciente) que ordene los
//    mismos y los retorne en un vector de 3

    public static void recorrer(int valor,int valor2, int valor3, boolean orden){
        int[] numeros = victor(valor,valor2,valor3,orden);
        for (int i = 0 ; i < numeros.length ; i++){
            System.out.println(numeros[i]);
        }
    }

    public static int[] victor(int valor, int valor2, int valor3, boolean orden) {
        int aux  ;
        int[] vector = new int[]{valor, valor2, valor3};
        for (int x = 0; x < vector.length -1 ; x++){
            for (int y = x+1 ; y < vector.length ; y++){ // Arranco desde posicion 1 para comparar ;
                if (orden){
                    if (vector[x] > vector[y]){ // Para ordenar de menor a mayor
                        aux = vector[x];
                        vector[x]=vector[y];
                        vector[y] = aux ; // EJEMPLO : TAZA DE CAAFEE :D teoría de tyron
                    }
                }else {
                    if (vector[x] < vector[y]){ // Ordenar de mayor a menor
                        aux = vector[x];
                        vector[x] = vector[y];
                        vector[y] = aux;
                    }
                }
            }
        }
        return vector;
    }

//    dado un vector de números, y un número X, que sume todos los números > X y
//    retorne el resultado

    public static int sumatoria(int [] vector , int numero){
        int total=0;
        for (int i = 0 ; i < vector.length ; i++){
           if (vector[i] > numero){// comparar el vector en cada posicion con el parametro
               total += vector[i];
           }
        }
        return total;
    }

}
