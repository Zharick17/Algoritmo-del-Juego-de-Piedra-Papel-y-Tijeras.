package org.example;
import java.util.Scanner;

public class Menu {
    private String usuario;
    private int eleccionUsuario;
    Scanner ingresarDatos = new Scanner(System.in);
    Jugar jugar = new Jugar();
    Validar validar = new Validar();
    public void menu(){

            System.out.println(".*.*.*.*.Bienvenido al juego de piedra papel y tijeras.*.*.*.*.");
            System.out.println(" ");
            System.out.println("Querido jugador ingresa tu usuario:  ");
             do {
                 usuario = ingresarDatos.nextLine();
                 if (validar.validarDatos(usuario)) {
                     System.out.println("Ingresa nuavmente el nombre");
                }
             }while(validar.validarDatos(usuario));

        int seguir = 5;

         do {

             System.out.println(" ");
             System.out.println("Selecciona unas de estas opciones que va a elegir:  ");
             System.out.println("Piedra = 0");
             System.out.println("Papel = 1");
             System.out.println("Tijeras = 2");
             do {
                 eleccionUsuario = ingresarDatos.nextInt();
                 jugar.guardarSeleccion(eleccionUsuario , usuario);

                 if (!validar.validarEleccion(eleccionUsuario)){
                     System.out.println("Numero invalido, intentalo nuevamente");
                 }

             }while (!validar.validarEleccion(eleccionUsuario));
             System.out.println("Si quieres seguir jugando ingrese 5 y para salir del juego ingresa oto numero.");
             seguir = ingresarDatos.nextInt();

         }while ( seguir == 5);


    }
}
