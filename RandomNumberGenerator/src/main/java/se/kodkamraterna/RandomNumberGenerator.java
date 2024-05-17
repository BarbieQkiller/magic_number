package se.kodkamraterna;

import java.util.Random;

/**
 * @author Angela Gustafsson, anggus-1
 */
public class RandomNumberGenerator implements NumberGenerator {
    private final Random random = new Random();


    @Override
    public int getNumber() {
        return random.nextInt();
    }

    @Override
    public String getName() {
        return "random";
    }
}

