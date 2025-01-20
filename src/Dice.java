import java.util.Random;

public abstract class Dice {
    private int nbSides;

    public Dice(int nbSides) {
        this.nbSides = nbSides;
    }

    public int getNbSides() {
        return this.nbSides;
    }

    public int roll(int nbRolls) {
        int total = 0;
        for (int i = 0; i < nbRolls; i++) {
            total += this.roll();
        }
        return total;
    }

    public int roll() {
        return new Random().nextInt(this.nbSides) + 1;
    }
}
