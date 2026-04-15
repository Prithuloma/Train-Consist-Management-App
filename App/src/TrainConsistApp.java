import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("======================================\n");

        // LinkedHashSet → maintains order + removes duplicates
        Set<String> formation = new LinkedHashSet<>();

        // ADD bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ADD duplicate intentionally
        formation.add("Sleeper"); // will be ignored

        // DISPLAY final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}