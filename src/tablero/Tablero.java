package tablero;
import java.util.ArrayList;
import ficha.Ficha;

public class Tablero {
    private int casillas;
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private boolean termina = false;
    private Ficha gana;

    public Tablero(int casillas, Ficha jugador1, Ficha jugador2, Ficha jugador3, Ficha jugador4) {
        this.casillas = casillas;
        this.fichas.add(jugador1);
        this.fichas.add(jugador2);
        this.fichas.add(jugador3);
        this.fichas.add(jugador4);
        System.out.println("Los jugadores son: " + jugador1.getColor() + ", " + jugador2.getColor() + ", " + jugador3.getColor() + ", " + jugador4.getColor());
    }

    public void ganador(Ficha gana) {
        this.gana = gana;
        this.termina = true;
    }

    public void turno() {
        for (Ficha actual : fichas) {
            System.out.print(actual.getColor() + " avanzó a la casilla: ");
            actual.avanzar();

            if (actual.getPosicion() >= casillas) {
                ganador(actual);
            }

            if (termina == true) {
                System.out.println("---------------------");
                System.out.println("El jugador " + gana.getColor() + " ganó la partida.");
                System.out.println("---------------------");
                return;
            }
        }
        System.out.println("---------------------");
        turno();
    }
}