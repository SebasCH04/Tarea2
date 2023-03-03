import tablero.Tablero;
import ficha.Ficha;

public class Main {
    public static void main(String[] args) throws Exception {
        Ficha ficha1 = new Ficha("Azul");
        Ficha ficha2 = new Ficha("Verde");
        Ficha ficha3 = new Ficha("Rojo");
        Ficha ficha4 = new Ficha("Amarillo");

        Tablero tablero1 = new Tablero(50, ficha1, ficha2, ficha3, ficha4);
        tablero1.turno();
        //El ciclo esta en Tablero.turno()
    }
}