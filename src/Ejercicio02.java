import java.util.Scanner;

public class Ejercicio02 {

//    Genere una clase que tenga los métodos para realizar la codificación y decodificación
//    de un string, dado un número de desplazamiento.
//●
//    Por ejemplo, con desplazo de 1:
//            “hola que tal” -> “ipmbarvfaubm”
//    h -> i
//    o -> p
//●
//    cn desplazo de 2 :
//            “hola que tal” -> “jqncbswgbvcn”
//    h -> j
//    o -> q

    static String palabraCifrada = "";
    static String palabraDescifrada = "";

    public static String codificar(String palabra, int desplazar) {
        char letraCifrada;
        for (int x = 0; x < palabra.length(); x++) { // itero y recupero cada caracter del String

            letraCifrada = (char) ((int) palabra.charAt(x) + desplazar); // casteo explicito de int -> char .
            palabraCifrada += letraCifrada; // Sumo cada char que consigo con cada iteracion en una variable. Asi consigo un String

        }
        return palabraCifrada;
    }

//    public String decodificar(String palabra, int desplazar){};

    public static String decodificar(int desplazar) {
        char letraCifrada;
        for (int x = 0; x < palabraCifrada.length(); x++) {

            letraCifrada = (char) ((int) palabraCifrada.charAt(x) - desplazar);
            palabraDescifrada += letraCifrada;
        }
        return palabraDescifrada;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("que palabra queres codificar ? ");
        String input = scanner.nextLine();
        System.out.println("Ingresa un numero entero de base para codificacion :");
        int numeroBase = scanner.nextInt();
        codificar(input, numeroBase);
        System.out.println("su palabra codificada es : "+palabraCifrada);
        decodificar(numeroBase);
        System.out.println("Y su decodificacion es :"+palabraDescifrada);
    }

}
