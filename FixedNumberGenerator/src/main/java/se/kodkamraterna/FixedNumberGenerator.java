package se.kodkamraterna;

/**
 * @author Angela Gustafsson, anggus-1
 */
public class FixedNumberGenerator implements NumberGenerator {


    @Override
    public int getNumber() {
        return 42;
    }

    @Override
    public String getName() {
        return "The meaning of life";
    }
}