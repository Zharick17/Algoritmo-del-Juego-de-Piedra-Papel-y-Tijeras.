package org.example;
import java.util.Random;
public class Jugar {
    public void guardarSeleccion(int eleccionUsuario, String usuario ) {

        int Piedra = 0;
        int Papel = 1;
        int Tijera = 2;

        Random random = new Random();
        int seleccionSistema = random.nextInt(3);
        System.out.println("El Sistema eligió: " + seleccionSistema);

        if (eleccionUsuario == seleccionSistema){
            System.out.println("ooh, han empatado ");

        } else if (eleccionUsuario == 0 && seleccionSistema == 1) {
            System.out.println(":( te ah ganado el sistema");

        } else if (eleccionUsuario == 1 && seleccionSistema == 0) {
            System.out.println("Has ganado " + usuario + " felicidades");

        } else if (eleccionUsuario == 2 && seleccionSistema == 0) {
            System.out.println(":( te ah ganado el sistema");

        } else if (eleccionUsuario == 0 && seleccionSistema == 2) {
            System.out.println("Has ganado " + usuario + " felicidades");

        } else if (eleccionUsuario == 1 && seleccionSistema == 2) {
            System.out.println(":( te ah ganado el sistema");

        } else if (eleccionUsuario == 2 && seleccionSistema == 1) {
            System.out.println("Has ganado " + usuario + " felicidades");
        }
    }
}


