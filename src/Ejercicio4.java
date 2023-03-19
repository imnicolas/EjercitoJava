import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio4 {

//    Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
//    contener números. El programa debe escribir por consola la suma de esos números
//a. Al programa anterior agreguele un parámetro para que la operación pueda ser
//    suma o multiplicación.

    public static void main(String[] args){
        String condicion = "m";

        ej2(condicion);
    }

    public static void ej2(String condicion){
        try {

            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("texto.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo,true);
            FileReader leer = new FileReader(archivo);

            int c = leer.read();
            int operacion = 0;
            int operacionM = 1 ;
            while(c != -1){

                if (condicion == "s"){
                    System.out.println("estoy sumando");
                    operacion += Character.getNumericValue(c);
                }
                if(condicion == "m"){ // Estoy aprendiendo de dani gii
                   System.out.println("estoy multiplicando");
                    operacionM *= Character.getNumericValue(c);
               }

                System.out.println((char)c);
                c = leer.read();

            }
            System.out.println(operacion);
            System.out.println(operacionM);

            //Escribimos en el archivo con el metodo write
//            for (int i = 0; i < 5; i++) {
//                escribir.write("5");
//            }

            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

}
