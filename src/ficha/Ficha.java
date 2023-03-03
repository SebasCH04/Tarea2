package ficha;
import dado.Dado;

public class Ficha {
    private String color;
    private int posicion;
    private Dado dado = new Dado(6);

    public Ficha(String color) {
        this.color = color;
        this.posicion = 0;
    }

    public String getColor() {
        return color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void avanzar() {
        int pasos = this.dado.lanzar();
        this.posicion += pasos;
        System.out.println(this.posicion);
    }
}