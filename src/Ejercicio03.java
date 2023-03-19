import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

//    1. Tomando los Ejercicios de la clase anterior
//    a. haga un main, donde por parámetro ponga 3 números y una letra que
//    represente ascendente o descendente y los muestre ordenados por tal criterio

//    static int [] a = {6,5,7,8,86,6,4,2} ;
//    static int menor ;
//
//    public static int[] ordenar (int[] iLista , int aux){
//        for (int i = 0; i< iLista.length ; i++){
//            aux = iLista[0];
//            if (iLista[i] < aux ){
//                aux = iLista[i] ;
//            }else if (iLista[i] > aux){
//                aux = aux;
//            }
//        }
//        System.out.println(iLista);
//        return iLista;
//    }


    public static void main(String[] args) {
        int[] a = {7, 2, 4, 8, 3, 9, 1, 5, 10, 6};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }

}