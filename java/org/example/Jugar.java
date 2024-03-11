package org.example;
public class Jugar {
    public void guardarSeleccion(Menu menu, int eleccionJugadorUno,int eleccionJugadorDos ) {


        if (eleccionJugadorUno == eleccionJugadorDos){
            System.out.println("ooh, han empatado ");

        } else if (eleccionJugadorUno == 0 && eleccionJugadorDos == 1) {
            System.out.println("Te ha ganado el Jugador Dos");
            menu.setVictoriaJugadorDos(menu.getVictoriaJugadorDos() +1);


        } else if (eleccionJugadorUno == 1 && eleccionJugadorDos == 0) {
            System.out.println("Te ha ganado el Jugador Uno");
            menu.setVictoriaJugadorUno(menu.getVictoriaJugadorUno() +1);

        } else if (eleccionJugadorUno == 2 && eleccionJugadorDos == 0) {
            System.out.println(":( Te ha ganado el Jugador Dos");
            menu.setVictoriaJugadorDos(menu.getVictoriaJugadorDos() +1);

        } else if (eleccionJugadorUno == 0 && eleccionJugadorDos == 2) {
            System.out.println("Te ha ganado el Jugador uno");
            menu.setVictoriaJugadorUno(menu.getVictoriaJugadorUno() +1);

        } else if (eleccionJugadorUno == 1 && eleccionJugadorDos == 2) {
            System.out.println("Te ha ganado el Jugador Dos");
            menu.setVictoriaJugadorDos(menu.getVictoriaJugadorDos() +1);

        } else if (eleccionJugadorUno == 2 && eleccionJugadorUno == 1) {
            System.out.println("Te ah ganado el jugador Uno" );
            menu.setVictoriaJugadorUno(menu.getVictoriaJugadorUno() +1);
        }
    }
}


