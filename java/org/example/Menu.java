package org.example;
import java.util.Scanner;
import  java.util.InputMismatchException;

public class Menu {
    private String jugadorUno;
    private String jugadorDos;
    private Integer eleccionJugadorUno;
    private Integer eleccionJugadorDos;
    private  int victoriaJugadorUno;
    private  int victoriaJugadorDos;
    Scanner ingresarDatos = new Scanner(System.in);
    Jugar jugar = new Jugar();
    Validar validar = new Validar();


    public void menu(){

        System.out.println(".*.*.*.*.Bienvenido al juego de piedra papel y tijeras.*.*.*.*.");
        System.out.println(" ");
     int continuar = 1;
     while (continuar == 1){
         System.out.println("Querido jugador uno ingresa tu nombre:  ");
         do {
             jugadorUno = ingresarDatos.nextLine();
             if (validar.validarNombreUno(jugadorUno)) {
                 System.out.println("Error nombre no valido, ingresa nuavamente el nombre");
             }
         }while(validar.validarNombreUno(jugadorUno));

         System.out.println("Querido jugador dos ingresa tu nombre:  ");
         do {
             jugadorDos = ingresarDatos.nextLine();
             if (validar.validarNombreDos(jugadorDos)) {
                 System.out.println("Error nombre no valido, ingresa nuavamente el nombre");
             }
         }while(validar.validarNombreDos(jugadorDos));

             for (int partidas = 0 ; partidas < 3 ; partidas++){

                 System.out.println("...Bienvenidos al Juego de Piedra, Papel y Tijeras...");
                 System.out.println("  ");
                 System.out.println("Selecciona algunas de estas opciones que vas elegir:  ");
                 System.out.println(" ");
                 System.out.println("Piedra = 0");
                 System.out.println("Papel = 1");
                 System.out.println("Tijeras = 2");
                 System.out.print( "Eliga tu opcion " + jugadorUno);
                 eleccionJugadorUno = validar.validarOpcion(" que sea valida ");
                 System.out.print("Eliga tu opcion "+ jugadorDos);
                 eleccionJugadorDos =  validar.validarOpcion(" que sea valida " );
                 jugar.guardarSeleccion(this, eleccionJugadorUno, eleccionJugadorDos);

             }

         if (victoriaJugadorUno > victoriaJugadorDos){
             System.out.println(jugadorUno+ " Ganaste la partida ");
         }else if (victoriaJugadorUno < victoriaJugadorDos) {
             System.out.println(jugadorDos + " Ganaste la partida ");
         }else {
             System.out.println("La partida termino en empate. ");
         }

         System.out.println("Si quieres jugar otra partina ingrese uno y sino ingrse otro numero para que se termine el juego");
         try {
             continuar = ingresarDatos.nextInt();
             ingresarDatos.nextLine();
         } catch (InputMismatchException e) {
             System.out.println("Entrada no válida. El juego ha terminado.");
             break;
         }
     }

    }


    public String getJugadorUno() {
        return jugadorUno;
    }

    public void setJugadorUno(String jugadorUno) {
        this.jugadorUno = jugadorUno;
    }

    public String getJugadorDos() {
        return jugadorDos;
    }

    public void setJugadorDos(String jugadorDos) {
        this.jugadorDos = jugadorDos;
    }

    public Integer getVictoriaJugadorUno() {
        return victoriaJugadorUno;
    }

    public void setVictoriaJugadorUno(int victoriaJugadorUno) {
        this.victoriaJugadorUno = victoriaJugadorUno;
    }

    public int getVictoriaJugadorDos() {
        return victoriaJugadorDos;
    }

    public void setVictoriaJugadorDos(int victoriaJugadorDos) {
        this.victoriaJugadorDos = victoriaJugadorDos;
    }
}
