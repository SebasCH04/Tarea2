package dado;
import java.util.Random;

public class Dado {
    private int caras;
    private Random rnd = new Random();

    public Dado(int numCaras) {
        this.caras = numCaras;
    }

    public int lanzar() {
        return this.rnd.nextInt(this.caras) + 1;
    }
}