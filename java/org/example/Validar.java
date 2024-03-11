package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validar {

   Scanner leerOpcion = new Scanner(System.in);

   public boolean validarNombreUno(String jugadorUno){
      String validate  = "[a-zA-Z]+";
      return !jugadorUno.matches(validate);
   }

   public boolean validarNombreDos(String jugadorDos ){
      String validate  = "[a-zA-Z]+";
      return !jugadorDos.matches(validate);
   }

   public  int validarOpcion (String mensaje) {
      int opcion = -1;
      boolean entradaValida = false;
      while (!entradaValida) {
         System.out.print(mensaje);
         try {
            opcion = Integer.parseInt(leerOpcion.nextLine());
            if (opcion >= 0 && opcion <= 2) {
               entradaValida = true;
            } else {
               System.out.println("Por favor, ingresa una opción válida (0, 1, o 2).");
            }
         } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa una opción válida (0, 1, o 2).");
         }
      }
      return opcion;
   }
}