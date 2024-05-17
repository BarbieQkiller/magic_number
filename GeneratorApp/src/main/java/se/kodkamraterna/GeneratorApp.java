package se.kodkamraterna;

import java.util.ServiceLoader;

/**
 * @author Angela Gustafsson, anggus-1
 */
public class GeneratorApp {
    public static void main(String[] args) {
        ServiceLoader<NumberGenerator> generators = ServiceLoader.load(NumberGenerator.class);


        for (NumberGenerator generator : generators) {
            System.out.println("Using generator: " + generator.getName());
            System.out.println("number: " + generator.getNumber());

        }
    }
}