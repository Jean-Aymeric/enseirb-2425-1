import java.util.Random;

public class D6Cheated extends D6 {

    @Override
    public int roll() {
        System.out.println("cheated");
        return new Random().nextInt(2) + 5;
    }
}
